import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        double base,altura,area,perimetro,diagonal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Base do retangulo : ");
        base = sc.nextDouble();
        System.out.println("Altura do retangulo : ");
        altura= sc.nextDouble();
        sc.close();

        area = base * altura;
        perimetro = base * 2 + altura * 2;
        diagonal = Math.sqrt(base * base + altura * altura);

        System.out.println("AREA = " + area);
        System.out.println("PERIMETRO = " + perimetro);
        System.out.println("DIAGONAL = " + diagonal);





    }
}
