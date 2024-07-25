package Alturas.src;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int[] qtdPessoas = new int[sc.nextInt()];

        String[] nome = new String[qtdPessoas.length];
        int[] idade = new int[qtdPessoas.length];
        double[] altura = new double[qtdPessoas.length];

        for(int i = 0; i < qtdPessoas.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "pessoa:");
            nome[i] = sc.nextLine();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
        }

        double soma = 0;
        double menos16 = 0;
        String[] pessoasMenos16 = new String[qtdPessoas.length];
        for(int i = 0; i < qtdPessoas.length; i++){
            soma += altura[i];
            if(idade[i] < 16){
                menos16 += idade[i];
                pessoasMenos16[i] = nome[i];
            }
        }

        double media = soma/ qtdPessoas.length;
        double porcentMenos16 = menos16 * 100/ qtdPessoas.length;

        System.out.println("Altura média " + media);
        System.out.println("Pessoas com menos de 16 anos" + porcentMenos16);

        for(int i = 0; i < pessoasMenos16.length; i++){
            System.out.println(pessoasMenos16[i]);
        }


    }






}
