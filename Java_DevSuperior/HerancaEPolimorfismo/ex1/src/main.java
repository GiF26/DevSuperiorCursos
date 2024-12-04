package ex1.src;

import ex1.Objects.employee;
import ex1.Objects.outSourcedEmployeer;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            ArrayList<employee> employees = new ArrayList<>();

            System.out.println("Enter the number of employees: ");
            int qtd = sc.nextInt();

            for(int i = 0; i < qtd ; i++){
                employee emp = new employee();
                System.out.println("Employee #" + (i + 1) + " data: ");
                System.out.println("Outsourced (y/n): ");
                String decision = sc.next().toLowerCase();
                System.out.println("Name: ");
                emp.setName(sc.next());
                sc.nextLine();
                System.out.println("Hours: ");
                emp.setHours(sc.nextInt());
                System.out.println("Value per hour: ");
                emp.setValuePerHour(sc.nextDouble());
                if(decision.equals("y")){
                    System.out.println("Additional charge:");
                    double addCharge = sc.nextDouble();
                    outSourcedEmployeer ose = new outSourcedEmployeer(emp.getName(), emp.getHours(), emp.getValuePerHour(), addCharge);
                    employees.add(ose);
                }else{
                    employees.add(emp);
                }
            }

          System.out.println("PAYMENTS:");
          for(employee o : employees) {
              System.out.println(o.getName()  + " - $ " + o.payment());
          }
        }
    }
}
