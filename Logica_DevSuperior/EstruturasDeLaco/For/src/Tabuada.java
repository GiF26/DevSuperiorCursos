package For.src;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, multiplicacao = 0;

        System.out.println("Deseja a tabuada pra qual valor? ");
        n = sc.nextInt();
        sc.close();

        for(int i = 0; i <= 10; i++){
            multiplicacao = n * i;
            System.out.println( n + "X" + i + " = " + multiplicacao);
        }
    }
}
