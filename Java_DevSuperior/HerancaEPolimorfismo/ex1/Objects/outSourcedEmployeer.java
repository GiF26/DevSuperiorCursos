package ex1.Objects;

public class outSourcedEmployeer extends employee{

    public outSourcedEmployeer() {
    }

    public outSourcedEmployeer(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    private double additionalCharge(){
        return 0;
    }
}
