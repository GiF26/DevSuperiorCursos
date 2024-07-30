package Ex_Fixacao.src;

import Ex_Fixacao.Object.Functionary;

import java.util.Scanner;

import static Ex_Fixacao.Object.Functionary.increaseSalary;
import static Ex_Fixacao.Object.Functionary.listEmployee;

public class Application {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("How many employees will be registered?");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                Functionary obj = new Functionary();

                System.out.println("Employee #" + (i +1));
                System.out.println("Id: ");
                obj.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Name: ");
                obj.setName(sc.nextLine());
                System.out.println("Salary: ");
                obj.setSalary(sc.nextDouble());

                listEmployee.add(obj);
            }

            System.out.println("Enter the employee id that will have salary increase :");
            int idSelected = sc.nextInt();
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();

            increaseSalary(idSelected, percentage);

            System.out.println("\n");

            for (Functionary emp : listEmployee) {
                System.out.println(emp.getId() + "," + emp.getName() + "," + emp.getSalary());
            }
        }
    }
}
