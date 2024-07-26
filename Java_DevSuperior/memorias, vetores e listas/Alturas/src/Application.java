package Alturas.src;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int qtdPessoas = sc.nextInt();

        String[] nome = new String[qtdPessoas];
        int[] idade = new int[qtdPessoas];
        double[] altura = new double[qtdPessoas];

        for(int i = 0; i < qtdPessoas; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "pessoa:");
            System.out.println("nome :");
            nome[i] = sc.nextLine();
            System.out.println("idade :");
            idade[i] = sc.nextInt();
            System.out.println("altura :");
            altura[i] = sc.nextDouble();
        }

        double soma = 0;
        double menos16 = 0;

        for(int i = 0; i < qtdPessoas; i++){
            soma += altura[i];
            if(idade[i] < 16){
                menos16 ++;
            }
        }

        double media = soma / qtdPessoas;
        double porcentMenos16 = menos16 * 100 / qtdPessoas;

        System.out.println("\nAltura média: " + media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentMenos16 + "%");

        for(int i = 0; i < qtdPessoas; i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
