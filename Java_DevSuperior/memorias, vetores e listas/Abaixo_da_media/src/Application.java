package Abaixo_da_media.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;

        System.out.println("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Dite um numero");
            vetor[i] = sc.nextDouble();
        }

        for (double v : vetor) {
            soma += v;
        }

        double media = soma/n;
        System.out.println("MEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (double v : vetor) {
            if (v < media) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
