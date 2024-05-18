import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dis1 = 0, dis2 = 0, dis3 = 0;

        System.out.println("Escreva as medidas alcancadas:");
        dis1 = sc.nextDouble();
        dis2 = sc.nextDouble();
        dis3 = sc.nextDouble();
        sc.close();

        if (dis1 > dis2 && dis1 > dis3){
            System.out.println("Maior distancia : " + dis1);
        } else if (dis2 > dis3) {
            System.out.println("Maior distancia : " + dis2);
        } else {
            System.out.println("Maior distancia : " + dis3);
        }
    }
}

