package While.src;

import java.util.Scanner;

public class Pares_Consecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0, contador = 0, somaTotal = 0;

        System.out.println("Digite um numero inteiro: ");
        x = sc.nextInt();

        int somaPares = x;

        while (x != 0){
            while(contador <= 4){

                if(somaPares % 2 == 0){
                    somaTotal += somaPares;
                    System.out.println(somaPares);
                    somaPares += 2;
                }else{
                    System.out.println(somaPares);
                    somaPares += 1;
                    contador --;
                }

                contador ++;

            }

            System.out.println("Soma = " + somaTotal);

            contador = 0;
            somaPares = 0;

            System.out.println("Digite um numero inteiro: ");
            x = sc.nextInt();

        }
        sc.close();
    }
}


