import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle obj = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo:");
        obj.width  = sc.nextDouble();
        obj.height = sc.nextDouble();

        System.out.println(obj);
        sc.close();
    }
}
