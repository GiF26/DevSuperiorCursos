package Soma_vetores.src;

import java.util.Scanner;

public class Application {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int[] vetor2 = new int[n];
        int[] vetoresSomados = new int[n];

        valoresVetores(vetor, "a");
        valoresVetores(vetor2, "b");

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vetor.length; i++){
            vetoresSomados[i] = vetor[i] + vetor2[i];
            System.out.println(vetoresSomados[i]);
        }

        sc.close();
    }

    public static void valoresVetores(int[] v, String id){
        System.out.println("Dite os valores do vetor " + id + " :");
        for (int i = 0; i < v.length; i++){
            v[i] = sc.nextInt();
        }
    }
}
