//package src;

import java.util.Scanner;

public class Concurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0,
            i = 0,
            aprovados = 0;

        double porcentApro = 0,
               maiorMed = 0,
               notaMedApro = 0,
               somaNotas = 0;;

        String maiorMedNome = null;

        String[] nome = new String[9];

        double[] n1 = new double[9],
                 n2 = new double[9],
                 media = new double[9];


        System.out.println("Qual a quantidade de pessoas?");
        n = sc.nextInt();

        for ( i = 0; i < n ; i++){
            sc.nextLine();
            System.out.println("Digite os dados da " + ( i + 1 ) + "° pessoa: ");
            System.out.println("Nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Primeira nota: ");
            n1[i] = sc.nextDouble();
            System.out.println("Segunda nota: ");
            n2[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println("");
        System.out.println("TABELA");

        for ( i = 0; i < n ; i++){
            media[i] = (n1[i] + n2[i]) / 2;
            System.out.println(nome[i] + ", " +
            				   n1[i] + ", " +
            				   n2[i] + 
            				   ", MEDIA = " + media[i]);
        }

        System.out.println("");
        System.out.println("PESSOAS APROVADAS:");

        for ( i = 0; i < n ; i++){
           if (media[i] >= 70){
                System.out.println(nome[i]);
                aprovados += 1;
            }
        }

        porcentApro = aprovados * 100 / n;

        for ( i = 0; i < n ; i++){
            if (media[i] > maiorMed){
                maiorMed = media[i];
                maiorMedNome = nome[i];
            }
        }
        
        for ( i = 0; i <= n - 1 ; i++){
            if (media[i] >= 70){
                somaNotas += media[i];
            }
        }

        notaMedApro = somaNotas / aprovados;
        
        System.out.println("");
        System.out.println("porcentagem de aprovacao: " + porcentApro + "%");
        System.out.println("Maior média: " + maiorMedNome);
        if(aprovados <= 0) {
        	System.out.println("Não há candidatos aprovados");
        }else {
            System.out.println("Nota média dos aprovados: " + Math.round(notaMedApro * 100.0)/100.0);
        }

    }
}
