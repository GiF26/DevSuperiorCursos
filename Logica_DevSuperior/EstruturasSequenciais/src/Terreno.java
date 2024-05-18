import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        double largura,comprimento,metrosQuad,area,preco;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno:");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno:");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado:");
        metrosQuad = sc.nextDouble();
        sc.close();

        area = largura * comprimento;
        preco = area * metrosQuad;

        System.out.println("Area do terreno : " + area);
        System.out.println("Preco do terreno : "+ preco);

    }
}
