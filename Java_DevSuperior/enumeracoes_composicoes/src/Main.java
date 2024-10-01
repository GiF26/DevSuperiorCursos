package src;

import Enums.WorkerLevel;
import Objects.Departament;
import Objects.HourContract;
import Objects.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Departament dp;
    static Worker wk = new Worker();

    public static void main(String[] args) throws ParseException {
        addDepartment();
        addWorker();
        addContract();
        calcIncome();
        sc.close();
    }

    public static void addDepartment(){
        System.out.println("Enter departament's name: ");
        dp = new Departament(sc.next());
    }

    public static void addWorker(){
        wk = new Worker();

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

    public static void addContract() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("How many contracts to this worker");
        int qtyContractWorker = sc.nextInt();

        for (int i = 0; i < qtyContractWorker; i++){
            HourContract hc = new HourContract();
            System.out.println("Enter #" + (i + 1) + "data:" );
            System.out.println("Date (DD/MM/YYYY):");
            String date = sc.next();
            hc.setDate(dateFormat.parse(date));
            System.out.println("Value per hour");
            hc.setValuePreHour(sc.nextDouble());
            System.out.println("Duration (hours)");
            hc.setHours(sc.nextInt());

            wk.addContract(hc);
        }
    }

    public static void calcIncome() {
        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String dateIncomeCalc = sc.next();
        String[] dateIncomeCalcSplit =  dateIncomeCalc.split("/");
        int month = Integer.parseInt(dateIncomeCalcSplit[0]);
        int year = Integer.parseInt(dateIncomeCalcSplit[1]);

        System.out.println("Departament :" + dp.getName());
        System.out.println("Name:" + wk.getName());
        System.out.println("Level:" + wk.getLevel());
        System.out.println("Income for " + dateIncomeCalc + ": " + wk.income(month, year));

    }


}
