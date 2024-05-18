
import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        double raio,area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo : ");
        raio = sc.nextDouble();
        sc.close();

        area = Math.PI * Math.pow(raio,2);

        System.out.println("\n AREA = " + Math.round(area));

    }
}
