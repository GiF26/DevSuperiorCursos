import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {
        double a, b, c, quadrado, triangulo, trapezio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medida A : ");
        a = sc.nextDouble();
        System.out.println("Digite a medida B : ");
        b = sc.nextDouble();
        System.out.println("Digite a medida C : ");
        c = sc.nextDouble();
        sc.close();

        quadrado = a * a;
        triangulo = ( a * b ) / 2.0;
        trapezio = ( a + b )* c  / 2.0;

        System.out.println("\nAREA DO QUADRADO : " + quadrado);
        System.out.println("\nAREA DO TRIANGULO : " + triangulo);
        System.out.println("\nAREA DO TRAPEZIO : " + trapezio);

    }
}
