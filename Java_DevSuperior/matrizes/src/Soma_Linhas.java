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

            for(int i = 0; i < l; i++){
                for(int x = 0; x < c; x++){
                    System.out.println("Digite os ellementos da " + (i +1) + "a linha");
                    mat[i][x] = sc.nextDouble();
                }
            }

            double[] v = new double[l];
            for(int i = 0; i < l; i++){
                double soma = 0.00;
                for(int x = 0; x < c; x++){
                    soma += mat [i][x];
                }
                v[i] = soma;

            }

            for (double value : v) {
                System.out.println("VETOR GERADO:" + value);
            }
        }
    }
}
