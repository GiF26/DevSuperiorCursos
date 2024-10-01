package Objects;

import Enums.WorkerLevel;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private ArrayList<HourContract> contracts = new ArrayList<HourContract>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Worker() {}

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(Integer month, Integer year){
        int mesObcject = 0;
        int anoObcject = 0;
        double totPerHour = 0.00;

        for(int i = 0; i < contracts.size(); i++){
            HourContract hc = contracts.get(i) ;

            String dataNum = hc.getDate().toLocaleString().substring(0,10);
            String[] parseDate = dataNum.split("/");
            mesObcject = Integer.parseInt(parseDate[1]);
            anoObcject = Integer.parseInt(parseDate[2]);

            System.out.println( mesObcject);
            System.out.println( anoObcject);

            if(mesObcject  == month && anoObcject == year){
                totPerHour += hc.totalValue();
            }
        }

        return totPerHour + getBaseSalary();
    }


}
