package ex3.Objects;

import java.util.ArrayList;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birth;
    private ArrayList<Order> orders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order o) {
        orders.add(o);
    }

    public void removeOrders(Order o) {
        orders.remove(o);
    }

    public Client(String name, String email, Date birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }
}
