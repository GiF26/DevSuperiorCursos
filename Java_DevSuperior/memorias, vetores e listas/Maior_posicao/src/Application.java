package Maior_posicao.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Dite um numero");
            vetor[i] = sc.nextInt();
        }

        double maiorValor = vetor[0];
        int posicaoMaiorValor = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maiorValor ){
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);

        sc.close();
    }
}
