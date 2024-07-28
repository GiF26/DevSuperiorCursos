package Numeros_pares.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Dite um numero");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");

        int qtdPares = 0;

        for (int j : vetor) {
            if (j % 2 == 0) {
                System.out.printf("%d  ", vetor[j]);
                qtdPares++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + qtdPares);

        sc.close();
    }
}
