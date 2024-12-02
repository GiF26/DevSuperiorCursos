package ex3.Objects;

public class OrderItem {
    private int quantity;
    private double price;
    private Product p;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subtotal(){
        return price * quantity;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }
}
