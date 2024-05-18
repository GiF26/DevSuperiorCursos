import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite A : ");
        a = sc.nextDouble();
        System.out.println("Digite B : ");
        b = sc.nextDouble();
        System.out.println("Digite C : ");
        c = sc.nextDouble();
        sc.close();

        delta = (b * 2) - 4 * a * c;
        x1 = b + Math.sqrt(delta) / 2 * a;
        x2 = b - Math.sqrt(delta) / 2 * a;

        if (delta < 0) {
            System.out.println("A equacao do segundo grau nao possui raízes reais");
        }else{
            System.out.println("Delta = " + delta);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
}
