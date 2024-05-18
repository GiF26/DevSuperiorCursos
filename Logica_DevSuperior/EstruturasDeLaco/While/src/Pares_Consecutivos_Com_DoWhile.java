package While.src;

import java.util.Scanner;

public class Pares_Consecutivos_Com_DoWhile {

   static int x = 0, contador = 0, somaTotal = 0,somaPares = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite um numero inteiro: ");
            x = sc.nextInt();
            sc.close();

            if(x != 0){
                somaPares = x;

                while(contador <= 4){
                    if(somaPares % 2 != 0){
                        somaPares += 1;
                    }

                    somaTotal += somaPares;
                    somaPares += 2;
                    contador ++;
                }

                System.out.println("Soma = " + somaTotal);
                limpa();
            }
        }while(x != 0);

    }

    public static void limpa (){
        contador = 0;
        somaPares = 0;
        somaTotal = 0;
    }
}
