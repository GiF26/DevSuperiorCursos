package Objects;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePreHour;
    private Integer hours;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePreHour() {
        return valuePreHour;
    }

    public void setValuePreHour(double valuePreHour) {
        this.valuePreHour = valuePreHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return 0;
    }

}
