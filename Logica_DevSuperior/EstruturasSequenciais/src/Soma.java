import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        int x = 0 , y = 0, soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de X : ");
        x = sc.nextInt();
        System.out.println("Digite o valor de Y : ");
        y = sc.nextInt();
        sc.close();

        soma = x + y;

        System.out.println("SOMA = " + soma);

    }
}
