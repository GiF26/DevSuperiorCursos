package ex2.Objects;

public class Product {
    protected String name;
    protected Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        StringBuilder s = new StringBuilder();
        s.append(name + " $ " + price);
        return s.toString();
    }
}
