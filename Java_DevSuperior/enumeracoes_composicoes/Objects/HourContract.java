package Objects;

public class HourContract {
    private long date;
    private double valuePreHour;
    private Integer hours;

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
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
