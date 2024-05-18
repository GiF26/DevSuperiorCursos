import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        String nome1, nome2;
        int idade1, idade2;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa : \n");

        System.out.println("Nome : ");
        nome1 = sc.nextLine();
        System.out.println("Idade :");
        idade1 = sc.nextInt();

        sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        System.out.println("Dados da segunda pessoa : \n");

        System.out.println("Nome : ");
        nome2 = sc.nextLine();
        System.out.println("Idade : ");
        idade2 = sc.nextInt();
        sc.close();

        media = (idade1 + idade2) / 2.0;

        System.out.println("\nA idade média de " + nome1 + " e " + nome2 + " é de : " + media);



    }
}
