package ex3.Objects;

import java.util.ArrayList;

public class OrderItem {
    private int quantity;
    private double price;
    private ArrayList<Product> products;

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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    //    public double subtotal(){
//        return price * quantity;
//    }
}
