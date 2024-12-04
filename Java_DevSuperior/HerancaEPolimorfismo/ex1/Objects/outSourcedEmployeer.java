package ex1.Objects;

public class outSourcedEmployeer extends employee{

    private Double additionalCharge;

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public outSourcedEmployeer() {
    }

    public outSourcedEmployeer(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return hours * valuePerHour + additionalCharge * 1.10;
    }
}
