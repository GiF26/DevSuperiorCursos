package ex3.Objects;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem oi) {
        orderItems.add(oi);
    }

    public void removeItem(OrderItem oi) {
        orderItems.remove(oi);
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double total(){
        double total = 0;

        for(OrderItem o : orderItems){
            total += o.subtotal();
        }
        return total;
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Order() {
    }
}
