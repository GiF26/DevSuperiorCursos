package Mais_velho.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int maiorIdade = 0, posiMaisVelha = 0;

            System.out.println("Quantas pessoas voce vai digitar ?");
            int n = sc.nextInt();

            String[] nome = new String[n];
            int[] idade = new int[n];

            for (int i = 0; i < n; i++) {
                sc.nextLine();
                System.out.println("Dados da " + (i + 1) + "pessoa:");
                System.out.println("Nome: ");
                nome[i] = sc.nextLine();
                System.out.println("Idade: ");
                idade[i] = sc.nextInt();
            }

            for (int i = 0 ; i < n ; i++){
                if (idade[i] > maiorIdade){
                    maiorIdade = idade[i];
                    posiMaisVelha = i;
                }
            }

            System.out.println("PESSOA MAIS VELHA: " + nome[posiMaisVelha]);
        }
    }
}
