package Objects;

public class Sale {
    private int month;
    private int year;
    private String seller;
    private int items;
    private double total;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Sale(int month, int year, String seller, int items, double total) {
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.items = items;
        this.total = total;
    }

    public double averagePrice(){
        return total/items;
    }

    @Override
    public String toString() {
        return  month + "/" + year + ", " +
                seller + ", " +
                items + ", " +
                String.format("%.2f",total)  +
                ", PM = " + String.format("%.2f",averagePrice());

    }
}
