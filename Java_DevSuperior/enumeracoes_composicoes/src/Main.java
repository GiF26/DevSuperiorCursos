package src;

import Enums.WorkerLevel;
import Objects.Departament;
import Objects.HourContract;
import Objects.Worker;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<HourContract> contracts = new ArrayList<>();
    static Worker wk = new Worker();
    static Departament dp;
    static Scanner sc = new Scanner(System.in);
    static int qtyContract = 0;


    public static void main(String[] args) {
        addDepartment();
        addWorker();
        addContract(qtyContract);
        calcIncome();
        sc.close();
    }

    public static void addDepartment(){
        System.out.println("Enter departament's name: ");
        dp = new Departament(sc.next());
    }

    public static void addWorker(){
        System.out.println("Enter worker data:");

        sc.nextLine();
        System.out.println("Name");
        wk.setName(sc.nextLine());

        System.out.print("Level");
        String level = sc.nextLine().toUpperCase();
        switch (level){
            case "JUNIOR":
                wk.setLevel(WorkerLevel.JUNIOR);
                break;
            case "MID LEVEL":
                wk.setLevel(WorkerLevel.MID_LEVEL);
                break;
            case "SENIOR":
                wk.setLevel(WorkerLevel.SENIOR);
                break;
        }


        System.out.println("Base salary");
        double baseSalary = sc.nextDouble();
        wk.setBaseSalary(baseSalary);
    }

    public static void addContract(int qtyContract){
        System.out.println("How many contracts to this worker");
        int qtyContractWorker = sc.nextInt();

        while (contracts.size()  <= qtyContractWorker){
            HourContract hc = new HourContract();
            int contador = 1;
            System.out.println("Enter #" + contador + "data:" );

            System.out.println("Date (DD/MM/YYYY):");
            String parseDate = String.format(sc.next(), "DD/MM/YYYY");
            System.out.println(parseDate);
//            Date date = Date.parse(parseDate);
            //hc.setDate(Date.parse(date));

            System.out.println("Value per hour");
            hc.setValuePreHour(sc.nextDouble());
            System.out.println("Duration (hours)");
            hc.setHours(sc.nextInt());

            contracts.add(hc);
        }
    }

    public static void calcIncome(){
        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String income = sc.next();

        System.out.println("Name:");
        System.out.println(wk.getName());
        System.out.println("Departament :" );
        System.out.println(dp.getName());
        System.out.println("Income for " + income + ":");
        double incomeValue = 0;
        System.out.println(incomeValue);

        contracts.clear();
    }


}
