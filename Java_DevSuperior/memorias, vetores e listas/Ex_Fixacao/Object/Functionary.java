package Ex_Fixacao.Object;

import java.util.List;

public class Functionary {
    private int id;
    private String name;
    private double salary;

    public static List<Functionary> listEmployee = new java.util.ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void increaseSalary(int id, double percent){

        for (Functionary i : listEmployee){
            if(i.getId() == id){
                double newSalary = i.getSalary() + (i.getSalary() * (percent / 100)) ;
                i.setSalary(newSalary);
                break;
            }
        }



    }
}
