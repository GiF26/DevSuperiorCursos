package Media_pares.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            double soma = 0.0;
            int qtdPares = 0;

            System.out.println("Quantos numeros voce vai digitar ?");
            int n = sc.nextInt();

            int[] vetor = new int[n];

            for (int i = 0; i < vetor.length; i++){
                System.out.println("Dite um numero");
                vetor[i] = sc.nextInt();
            }

            for (int j : vetor) {
                if (j % 2 == 0) {
                    soma += j;
                    qtdPares++;
                }
            }

            if (qtdPares > 0){
                double media = soma / qtdPares;
                System.out.println("MEDIA DOS PARES : " + media);
            }else{
                System.out.println("NENHUM NUMERO PAR");
            }

        }
    }
}
