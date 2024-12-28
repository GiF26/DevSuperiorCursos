package Objects;

import java.util.Date;

public class Contract {
    Integer nmbContract;
    Date dateContract;
    Double valueContrato;

    public Integer getNmbContract() {
        return nmbContract;
    }

    public void setNmbContract(Integer nmbContract) {
        this.nmbContract = nmbContract;
    }

    public Date getDateContract() {
        return dateContract;
    }

    public void setDateContract(Date dateContract) {
        this.dateContract = dateContract;
    }

    public Double getValueContrato() {
        return valueContrato;
    }

    public void setValueContrato(Double valueContrato) {
        this.valueContrato = valueContrato;
    }

    public Contract() {
    }

    public Contract(Integer nmbContract, Date dateContract, Double valueContrato) {
        this.nmbContract = nmbContract;
        this.dateContract = dateContract;
        this.valueContrato = valueContrato;
    }

    public double valorMensal (int month){
        double valueinstallments = getValueContrato() / 3;
        double valueWFees = valueinstallments + 1/100 * month;
        return valueWFees + 2/100 ;
    }

    public Date skipDates () {
        int addMonth = getDateContract().getMonth() + 1;
        getDateContract().setMonth(addMonth);
        return getDateContract();
    }

}
