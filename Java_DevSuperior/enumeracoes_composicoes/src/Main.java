package src;

import Enums.WorkerLevel;
import Objects.Departament;
import Objects.HourContract;
import Objects.Worker;
import com.sun.org.apache.xerces.internal.util.SAX2XNI;
import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ArrayList<HourContract> contracts = new ArrayList<>();
    static Worker wk = new Worker();
    static Departament dp;

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            addDepartment();
            addWorker();
            addContract();
            calcIncome();
        }
    }

    public static void addDepartment(){
        Scanner sc = new Scanner(System.in);
        dp = new Departament(sc.nextLine());
        System.out.println("Enter departament's name: ");
        sc.close();
    }

    public static void addWorker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter worker data:");
        System.out.println("Name");
        wk.setName(sc.nextLine());
        System.out.print("Level");
        String level = sc.next().toUpperCase();
        wk.setLevel(WorkerLevel.valueOf(level));
        System.out.println("Base salary");
        wk.setBaseSalary(sc.nextDouble());
        sc.close();
    }

    public static void addContract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many contracts to this worker");
        int qtyContractWorker = sc.nextInt();

        while (contracts.size()  <= qtyContractWorker){
            HourContract hc = new HourContract();
            int contador = 1;
            System.out.println("Enter #" + contador + "data:" );

            System.out.println("Date (DD/MM/YYYY):");
//            String parseDate = String.format(sc.next(), "DD/MM/YYYY");
//            Date date = Date.parse(parseDate);
//            hc.setDate(Date.parse(date));

            System.out.println("Value per hour");
            hc.setValuePreHour(sc.nextDouble());
            System.out.println("Duration (hours)");
            hc.setHours(sc.nextInt());

            contracts.add(hc);
        }
        sc.close();
    }

    public static void calcIncome(){
        Scanner sc = new Scanner(System.in);

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

        sc.close();
    }


}
