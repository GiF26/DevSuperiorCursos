import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();

        obj.nome = sc.nextLine();
        obj.nota1 = sc.nextDouble();
        obj.nota2 = sc.nextDouble();
        obj.nota3 = sc.nextDouble();

        System.out.println(obj);
        sc.close();

    }
}
