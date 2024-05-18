package For.src;

import java.util.Scanner;

public class Soma_Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int troca = 0, somaImpares = 0, somaTotal = 0;

        System.out.println("Digite dois numeros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if(y < x){
            troca = x;
            x = y;
            y = troca;
        }

        somaImpares = x;

        for(int i = somaImpares; somaImpares <= y - 1; i++){
            if(somaImpares % 2 == 0){
                somaImpares += 1;
            }
            somaTotal += somaImpares;
            somaImpares = somaImpares + 2;
        }

        if(x < 0){
            System.out.println(somaImpares - 2);
        }else {
            System.out.println(somaTotal);
        }
    }
}
