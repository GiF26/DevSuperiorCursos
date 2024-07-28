package Dados_pessoas.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Quantas pessoas serao digitadas ?");
            int n = sc.nextInt();

            double[] altura = new double[n];
            String[] genero = new String[n];

            for (int i = 0; i < n; i++){
                System.out.println("Altura da " + (i + 1) + "a pessoa:");
                altura[i] = sc.nextDouble();
                System.out.println("Genero da " + (i + 1) + "a pessoa:");
                genero[i] = sc.next();
            }

            double menorAltura = 10.0 , maiorAltura = altura[0], somaMediaMulheres = altura[0];
            int qtdHomens = 0;

            for (int i = 0; i < n; i++){
                if(altura[i] > maiorAltura){
                    maiorAltura = altura[i];
                }
                if(altura[i] < menorAltura){
                    menorAltura = altura[i];
                }
                if(genero[i].equals("f")){
                    somaMediaMulheres += altura[i];
                }
                if(genero[i].equals("m")){
                    qtdHomens ++;
                }
            }

            System.out.println("Menor altura = " + menorAltura);
            System.out.println("Maior altura = " + maiorAltura);
            double mediaAlturaMulheres = somaMediaMulheres / (n - qtdHomens);
            System.out.println("Media das alturas das mulheres = " + mediaAlturaMulheres);
            System.out.println("Numero de homens = " + qtdHomens);

        }
    }
}
