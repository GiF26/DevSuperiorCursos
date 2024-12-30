public class PaypalService implements OnlinePaymentService {

    @Override
    public double paymentFee(Double amount, Integer month) {
        return (amount * 0.01 * month);
    }

    @Override
    public double interest(Double amount) {
        return (amount * 0.02);
    }
}
