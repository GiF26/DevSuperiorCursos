import java.util.Scanner;

public class Diagonal_negativos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Qual a ordem da matriz?");
            int n = sc.nextInt();

            while(n > 10){
                System.out.println("ordem invalida, insira uma menor ou igual a 10!!");
                n = sc.nextInt();
            }

            int[][] mat = new int[n][n];

            for (int i = 0; i < mat.length; i++){
                for(int x = 0; x < mat.length; x++){
                    System.out.println("Elemento [" + i + "],[" + x  + "]");
                    mat[i][x] = sc.nextInt();
                }
            }

            int negativos = 0;
            for (int i = 0; i < mat.length; i++){
                System.out.println(mat[i][i]);
                for (int x = 0; x < mat.length; x++){
                    if(mat[i][x] < 0){
                        negativos++;
                    }
                }
            }

            System.out.println("quantidade de valores negativos : " + negativos);
        }
    }
}
