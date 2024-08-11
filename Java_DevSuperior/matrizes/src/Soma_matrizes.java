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

            System.out.println("Digite os valores da matriz A");
            int[][] mat = carregaMatrizes(l , c);
            System.out.println("Digite os valores da matriz B");
            int[][] mat2 = carregaMatrizes(l , c);

            int[][] matc = new int[l][c];
            for (int i = 0; i < l; i++) {
                for (int x = 0; x < c; x++) {
                    matc[i][x] = mat[i][x] + mat2[i][x];
                }
            }

            System.out.println("MATRIZ SOMA:");
            for (int i = 0; i < l; i++) {
                for (int x = 0; x < c; x++) {
                    System.out.println(matc[i][x]);
                }
            }
        }
    }

    private static int[][] carregaMatrizes(int l ,int c) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[l][c];
        for (int i = 0; i < l; i++) {
            for (int x = 0; x < c; x++) {
                System.out.println("Elemento [" + i + "],[" + x + "]");
                mat[i][x] = sc.nextInt();
            }
        }

        return mat;
    }
}
