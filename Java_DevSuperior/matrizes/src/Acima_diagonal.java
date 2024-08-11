import java.util.Scanner;

public class Acima_diagonal {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int somaDiag = 0;

            System.out.println("Qual a ordem da matiz ?");
            int n = sc.nextInt();

            int[][] mat = new int[n][n];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){

                    System.out.println("Elemento [" + i + "],[" + j + "]");
                    mat[i][j] = sc.nextInt();

                    if(j > i){
                        System.out.println(mat[i][j]);
                        somaDiag += mat[i][j];
                    }
                }
            }

            System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + somaDiag);

        }
    }
}
