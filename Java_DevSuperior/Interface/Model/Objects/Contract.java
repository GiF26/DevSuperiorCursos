package Objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer nmbContract;
    private Date dateContract;
    private Double valueContrato;

    List<Installments> installments = new ArrayList<>();

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

    public List<Installments> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installments> installments) {
        this.installments = installments;
    }

    public Contract() {
    }

    public Contract(Integer nmbContract, Date dateContract, Double valueContrato) {
        this.nmbContract = nmbContract;
        this.dateContract = dateContract;
        this.valueContrato = valueContrato;
    }
}
