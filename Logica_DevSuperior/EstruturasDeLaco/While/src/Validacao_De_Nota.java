package While.src;

import java.util.Scanner;

public class Validacao_De_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = 0, n2 = 0, media = 0;

        System.out.println("Digite a primeira nota : ");
        n1 =sc.nextDouble();

        while(n1 < 0 || n1 > 10 ){
            System.out.println("Valor Inválido! Tente novamente: ");
            n1 = sc.nextDouble();
        }

        System.out.println("Digite a segunda nota : ");
        n2 =sc.nextDouble();

        while(n2 < 0 || n2 > 10){
            System.out.println("Valor Inválido! Tente novamente: ");
            n2 = sc.nextDouble();
        }
        sc.close();

        media = (n1 + n2) / 2;

        System.out.printf("MEDIA = %.2f\n" , media);
    }
}
