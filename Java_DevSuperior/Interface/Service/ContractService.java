import Objects.Contract;
import Objects.Installments;

import java.text.ParseException;
import java.util.Date;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) throws ParseException {
        for (int i = 0; i < months; i++) {
            Date altDate = new Date(contract.getDateContract().getTime());

            altDate.setMonth(altDate.getMonth() + i + 1);

            double amount = contract.getValueContrato() / months;
            amount += onlinePaymentService.paymentFee(amount, i + 1);
            amount += onlinePaymentService.interest(amount);

            contract.getInstallments().add(new Installments(altDate, amount));
        }
    }
}
