import java.util.Scanner;

public class Matiz_geral {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Qual a ordem da matiz ?");
            int n = sc.nextInt();

            double[][] mat = new double[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Elemento [" + i + "],[" + j + "]");
                    mat[i][j] = sc.nextInt();
                }
            }

            System.out.println("SOMA DOS POSTIVOS = " + somaPositivo(mat, n) + "\n");

            System.out.println("escolha uma linha");
            int linha = sc.nextInt();
            System.out.println("LINHA ESCOLHIDA = " + imprimeLinha(mat, n, linha) + "\n");

            System.out.println("escolha uma coluna");
            int coluna = sc.nextInt();
            System.out.println("COLUNA ESCOLHIDA = " + imprimeColuna(mat, n, coluna) + "\n");

            System.out.println("DIAGONAL PRINCIPAL = " + diagonalPrincipal(mat, n) + "\n");

            System.out.println("MATRIZ ALTERADA: ");
            System.out.println(criaExibMatrizAlt(mat, n));

            }
        }

    private static double somaPositivo(double[][] mat, int tam) {
        double somaPositivos = 0;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (mat[i][j] > 0) {
                    somaPositivos += mat[i][j];
                }
            }
        }

        return somaPositivos;
    }

    private static String diagonalPrincipal(double[][] mat, int tam) {
        String linha = "";

        for (int i = 0; i < tam; i++) {
            linha += mat[i][i] + " ";
        }

        return linha;
    }

    private static String imprimeLinha(double[][] mat, int tam, int l) {
        String linha = "";

        for (int i = 0; i < tam; i++) {
            linha += mat[l][i] + " ";
        }

        return linha;
    }

    private static String imprimeColuna(double[][] mat, int tam, int c) {
        String linha = "";

        for (int i = 0; i < tam; i++) {
            linha += mat[i][c] + " ";
        }

        return linha;
    }

    private static String criaExibMatrizAlt(double[][] mat, int tam){
        String linha = "";

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                }
                linha += mat[i][j]+ " ";
            }
            linha += "\n";
        }

        return linha;
    }
}