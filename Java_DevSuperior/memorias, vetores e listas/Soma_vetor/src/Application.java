package Soma_vetor.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder strNum = new StringBuilder();
        int soma = 0;
        double media = 0.0;

        System.out.println("Quantos numeros voce vai digitar?");
        int qtdNumeros = sc.nextInt();

        double[] vetor = new double[qtdNumeros];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextInt();
        }

        for (double v : vetor) {
            strNum.append(String.valueOf(v + "  "));
            soma += v;
            media = (double) soma / vetor.length;
        }

        System.out.println("VALORES = " + strNum);
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
    }
}
