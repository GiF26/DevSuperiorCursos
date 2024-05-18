package For.src;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
//conforme exemplo

import java.util.Scanner;

public class Dentro_Fora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dentro = 0, fora = 0;

        System.out.println("Digite um valor N: ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n; i++){
            System.out.println("Digite o valor " + i );
            int x = sc.nextInt();

            if(x >= 10 && x <= 20){
                dentro += 1;
            }else{
                fora += 1;
            }
        }
        sc.close();
        System.out.println(dentro + "Dentro");
        System.out.println(fora + "Fora");
    }
}
