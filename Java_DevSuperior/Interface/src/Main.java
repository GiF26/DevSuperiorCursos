import Objects.Contract;
import Objects.Installments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        try(Scanner sc = new Scanner(System.in)){

            SimpleDateFormat sd = new SimpleDateFormat ("dd/MM/yyyy");

            System.out.println("Enter the contract details:");
            System.out.println("Number:");
            int number = sc.nextInt();
            System.out.println("Date (dd/MM/yyyy):");
            String date = sc.next();
            Date dateFormated = sd.parse(date);
            System.out.println("Value of contract:");
            double value = sc.nextDouble();

            Contract c = new Contract(number, dateFormated, value);

            System.out.println("Enter the contract installments");
            int installments = sc.nextInt();

            ContractService cs = new ContractService(new PaypalService());

            cs.processContract(c, installments);

            System.out.println("Installments:");
            for(Installments o : c.getInstallments()){
                System.out.println(o);
            }
        }
    }
}