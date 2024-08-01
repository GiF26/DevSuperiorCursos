package Ex_Fixacao.src;

import Ex_Fixacao.Object.Functionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            List<Functionary> listEmployee = new ArrayList<>();

            System.out.println("How many employees will be registered?");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                System.out.println("Employee #" + (i +1));
                System.out.println("Id: ");
                int id = sc.nextInt();

                while(hasId(listEmployee,id)){
                    System.out.println("Id already taken. Try again: ");
                    id = sc.nextInt();
                }

                sc.nextLine();
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Salary: ");
                double salary = sc.nextDouble();

                listEmployee.add(new Functionary(id,name,salary));
            }

            System.out.println("Enter the employee id that will have salary increase :");
            int id = sc.nextInt();
            Functionary emp = listEmployee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

            if(emp == null){
                System.out.println("This id does not exist!");
            }else{
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                emp.increaseSalary(percentage);
            }

            System.out.println("\n");
            System.out.println("List of employees:");

            for (Functionary o : listEmployee) {
                System.out.println(o);
            }
        }
    }

    public static boolean hasId(List<Functionary> list, int id) {
        Functionary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
