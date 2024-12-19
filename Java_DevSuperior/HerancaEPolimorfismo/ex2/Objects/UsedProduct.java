package ex2.Objects;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder s = new StringBuilder();
        s.append(super.name + " (used) $ " + super.price + " (Manufacture date: " + dateFormat.format(manufactureDate) + ")" );
        return s.toString();
    }
}
