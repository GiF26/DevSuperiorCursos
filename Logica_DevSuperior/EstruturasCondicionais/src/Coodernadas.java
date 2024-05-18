import java.util.Scanner;

public class Coodernadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = 0, y = 0;

        System.out.println("Escreva as coordenadas : ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        sc.close();

        if (x > 0 && y > 0) {
            System.out.println("src.Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("src.Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("src.Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("src.Quadrante 4");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("eixo y");
        } else if(y == 0){
            System.out.println("eixo x");
        }
    }
}
