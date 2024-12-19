import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter account data");
            System.out.println("Number:");
            int number = sc.nextInt();
            System.out.println("Holder:");
            String holder = sc.next();
            sc.nextLine();
            System.out.println("Initial balance:");
            double balance = sc.nextDouble();
            System.out.println("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account a = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Enter amount for withdraw:");
            double amount = sc.nextDouble();

            a.withdraw(amount);
            System.out.println("New balance: " + a.getBalance());

        }catch (RuntimeException r){
            System.out.println(r.getMessage());
        }
    }
}
