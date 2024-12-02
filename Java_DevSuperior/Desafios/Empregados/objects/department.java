package Empregados.objects;

import java.util.ArrayList;

public class department {
    String name;
    int payDay;
    ArrayList<employee> employees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public ArrayList<employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<employee> employees) {
        this.employees = employees;
    }

    public department() {
    }

    public department(String name, int payDay) {
        this.name = name;
        this.payDay = payDay;
    }

    public void addEmploye(employee emp){
        employees.add(emp);
    }

    public void removeEmploye(employee emp){
        employees.remove(emp);
    }

    public double payroll(){
        double total = 0;
        for (employee o : employees){
           total += o.getSalary();
        }
        return total;
    }


}
