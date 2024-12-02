package ex3.Objects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birth;
    private Order order;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Client(String name, String email, Date birth) throws ParseException {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Client: " + getName() +
                " (" +   birth.toLocaleString().substring(0,10) + ")" +
                " - " + getEmail();
    }
}
