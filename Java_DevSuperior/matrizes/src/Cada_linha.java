import java.util.Scanner;

public class Cada_linha {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int maior = 0;

            System.out.println("Qual a quantidade de linhas da matriz?");
            int l = sc.nextInt();
            while (l > 10) {
                System.out.println("ordem invalida, insXira uma menor ou igual a 10!!");
                l = sc.nextInt();
            }

            int[][] mat = new int[l][l];
            int[] v = new int[l];

            for(int i = 0; i < l; i++){
                for(int x = 0; x < l; x++){
                    System.out.println("Elemento [" + i + "," + x + "]:");
                    mat[i][x] = sc.nextInt();
                }
            }

            for(int i = 0; i < l; i++){
                maior = mat[i][0];
                for(int x = 1; x < l; x++){
                    if(maior < mat[i][x]){
                        maior = mat[i][x];
                    }
                    v[i] = maior;
                }
            }

            System.out.println("MAIOR ELEMENTO DE CADA LINHA");
            for (int j : v) {
                System.out.println(j);
            }
        }
    }
}
