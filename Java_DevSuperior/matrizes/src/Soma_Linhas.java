//Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
//        de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
//        seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.

import java.util.Scanner;

public class Soma_Linhas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Qual a quantidade de linhas da matriz?");
            int l = sc.nextInt();
            while(l > 10){
                System.out.println("ordem invalida, insira uma menor ou igual a 10!!");
                l = sc.nextInt();
            }

            System.out.println("Qual a quantidade de colunas da matriz?");
            int c = sc.nextInt();
            while(c > 10){
                System.out.println("ordem invalida, insira uma menor ou igual a 10!!");
                c = sc.nextInt();
            }

            double[][] mat = new double[l][c];


        }
    }
}
