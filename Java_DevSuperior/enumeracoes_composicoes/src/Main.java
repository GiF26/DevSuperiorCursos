package src;

import Enums.WorkerLevel;
import Objects.Worker;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Worker> addWorker(){

        Worker w = new Worker();

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Nome: ");
            w.setName(sc.nextLine());

            System.out.println("Niveis : 0-JUNIOR, 1- MMID_LEVEL, 2-SENIOR");
            System.out.println("Nivel: ");
            int nivel = sc.nextInt();
            while(nivel < 0 || nivel > 2){
                System.out.println("Niveis : 0-JUNIOR, 1- MMID_LEVEL, 2-SENIOR");
                System.out.println("Nivel: ");
                nivel = sc.nextInt();
            }
            switch (nivel){
                case 1:
                    w.setLevel(WorkerLevel.JUNIOR);
                    break;
                case 2:
                    w.setLevel(WorkerLevel.MID_LEVEL);
                    break;
                case 3:
                    w.setLevel(WorkerLevel.SENIOR);
                    break;
            }

            System.out.println("Salario: ");
            w.setBaseSalary(sc.nextDouble());
        }



        return addWorker();
    }



}
