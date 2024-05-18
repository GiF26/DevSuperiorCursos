package While.src;

import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0 , y = 0;

        System.out.println("Escreva os valores de x e y : ");
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        while (x != y){
            if(x < y){
                System.out.println("Ordem crescente");
            }else{
                System.out.println("Ordem decrescente");
            }

            System.out.println();

        }
    }
}
