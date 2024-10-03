package Objects;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePreHour;
    private Integer hours;

    public Date getDate() { return date;}

    public double getValuePerHour() {
        return valuePreHour;
    }

    public Integer getHours() {
        return hours;
    }

    public double totalValue(){
        return getHours() * getValuePerHour();
    }

    public HourContract(Date date, double valuePreHour, Integer hours) {
        this.date = date;
        this.valuePreHour = valuePreHour;
        this.hours = hours;
    }
}
