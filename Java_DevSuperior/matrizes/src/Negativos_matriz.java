import java.util.Scanner;

public class Negativos_matriz {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Qual a quantidade de linhas da matriz?");
            int l = sc.nextInt();
            while(l > 10){
                System.out.println("ordem invalida, insXira uma menor ou igual a 10!!");
                l = sc.nextInt();
            }

            System.out.println("Qual a quantidade de colunas da matriz?");
            int c = sc.nextInt();
            while(c > 10){
                System.out.println("ordem invalida, insira uma menor ou igual a 10!!");
                c = sc.nextInt();
            }

            int[][] mat = new int[l][c];

            for(int i = 0; i < l; i++){
                for(int x = 0; x < c; x++){
                    System.out.println("Elemento [" + i + "," + x + "]:");
                    mat[i][x] = sc.nextInt();
                }
            }

            System.out.println("VALORES NEGATIVOS:");
            for(int i = 0; i < l; i++){
                for(int x = 0; x < c; x++){
                    if(mat[i][x] < 0){
                        System.out.println(mat[i][x]);
                    }
                }
            }
        }
    }
}
