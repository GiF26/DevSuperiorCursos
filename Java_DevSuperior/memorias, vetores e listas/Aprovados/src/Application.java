package Aprovados.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Quantos alunos serao digitados ?");
            int n = sc.nextInt();

            String[] nome = new String[n];
            double[] nota1 = new double[n];
            double[] nota2 = new double[n];

            for (int i = 0; i < n; i++){
                sc.nextLine();
                System.out.println("Digite nome, primeira e segunda nota do " + (i +1 ) +"o aluno:");
                nome[i] = sc.nextLine();
                nota1[i] = sc.nextDouble();
                nota2[i] = sc.nextDouble();
            }

            System.out.println("Alunos aprovados:");
            for (int i = 0; i < n; i++){
                double media = (nota1[i] + nota2[i]) / 2;

                if(media >= 6){
                    System.out.println(nome[i]);
                }
            }
        }
    }
}
