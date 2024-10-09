package ex1.Objects;

import ex1.Objects.Enums.WorkerLevel;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private ArrayList<HourContract> contracts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        getContracts().add(contract);
    }

    public void removeContract(HourContract contract){
        getContracts().remove(contract);
    }

    public double income(Integer month, Integer year){
        int mesObject;
        int anoObject;
        double totPerHour = 0.00;

        for(int i = 0; i < contracts.size(); i++){
            HourContract hc = contracts.get(i) ;

            String dataNum = hc.getDate().toLocaleString().substring(0,10);
            String[] parseDate = dataNum.split("/");
            mesObject = Integer.parseInt(parseDate[1]);
            anoObject = Integer.parseInt(parseDate[2]);

            if(mesObject == month && anoObject == year){
                totPerHour += hc.totalValue();
            }
        }

        return totPerHour + getBaseSalary();
    }

    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }
}
