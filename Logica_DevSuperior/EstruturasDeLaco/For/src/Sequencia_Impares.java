package For.src;

import java.util.Scanner;

public class Sequencia_Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor X:");
        int x = sc.nextInt();
        sc.close();

        for (int i = 1; i <= x; i++){
            if(x % 2 == 0){
                x = x - 1;
            }
            System.out.println(i);
        }
    }
}
