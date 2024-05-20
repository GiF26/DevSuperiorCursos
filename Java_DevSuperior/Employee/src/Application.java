import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();

        System.out.println("Nome: ");
        obj.name = sc.nextLine();
        System.out.println("Salário Bruto: ");
        obj.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        obj.tax = sc.nextDouble();

        System.out.println("Funcionario: " + obj);

        System.out.println("Qual a porcentagem para aumentar o salário?");
        double percent = sc.nextDouble();
        obj.increaseSalary(percent);

        System.out.println("Dados Atualizados: " + obj);
        sc.close();
    }
}
