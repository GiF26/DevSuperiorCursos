import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        double nota1,nota2,notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota ");
        nota2 = sc.nextDouble();
        sc.close();

        notaFinal = nota1 + nota2;

        System.out.println("Nota final : " + notaFinal);

        if (notaFinal < 60) {
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }
    }
}
