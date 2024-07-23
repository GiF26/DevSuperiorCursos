package Negativos.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int qtdNumeros = sc.nextInt();

        int[] numerosNegativos = new int[qtdNumeros];

        for (int i = 0; i < numerosNegativos.length; i++){
            System.out.println("Digite um numero:");
            numerosNegativos[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int numerosNegativo : numerosNegativos) {
            if (numerosNegativo < 0) {
                System.out.println(numerosNegativo);
            }
        }
    }
}
