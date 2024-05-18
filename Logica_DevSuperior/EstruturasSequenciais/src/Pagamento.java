import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {
        String nome;
        double salarioPHora, quantidadeHora, totalSalario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome : ");
        nome = sc.nextLine();
        System.out.println("Valor por hora : ");
        salarioPHora = sc.nextDouble();
        System.out.println("Horas trabalhadas : ");
        quantidadeHora = sc.nextDouble();
        sc.close();

        totalSalario = salarioPHora * quantidadeHora;

        System.out.println("O pagamento para " + nome + " deve ser: " + totalSalario);

    }
}
