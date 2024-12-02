package Empregados.objects;

public class address {
    String email;
    String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public address() {}

    public address(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }
}
