import java.util.Scanner;

public class Soma_matrizes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Quantas linhas vai ter cada matriz?");
            int l = sc.nextInt();
            while(l > 10){
                System.out.println("ordem invalida, insXira uma menor ou igual a 10!!");
                l = sc.nextInt();
            }

            System.out.println("Quantas colunas vai ter cada matriz?");
            int c = sc.nextInt();
            while(c > 10){
                System.out.println("ordem invalida, insira uma menor ou igual a 10!!");
                c = sc.nextInt();
            }

            int[][] mat = new int[l][c];
            int[][] mat2 = new int[l][c];

            System.out.println("Digite os valores da matriz A");
            carregaMatrizes(mat);
            System.out.println("Digite os valores da matriz B");
            carregaMatrizes(mat2);

            for (int i = 0; i < l; i++) {
                for (int x = 0; x < c; x++) {
                    mat[i][x] = mat[i][x] + mat2[i][x];
                }
            }

            System.out.println("MATRIZ SOMA:");
            for (int i = 0; i < l; i++) {
                for (int x = 0; x < c; x++) {
                    System.out.println(mat[i][x]);
                }
            }
        }
    }

    private static void carregaMatrizes(int[][] mat) {
        try (Scanner sc = new Scanner(System.in)) {

            for (int i = 0; i < mat.length; i++) {
                for (int x = 0; x < mat.length; x++) {
                    System.out.println("Elemento [" + i + "],[" + x + "]");
                    mat[i][x] = sc.nextInt();
                }
            }
        }
    }
}
