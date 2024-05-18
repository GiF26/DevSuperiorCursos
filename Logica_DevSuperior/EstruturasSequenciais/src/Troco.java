import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {
        double precoUni, precoTotal, troco, dinheiroCli;
        int quantidade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Preco unitario do produto :");
        precoUni = sc.nextDouble();
        System.out.println("Quantidade comprada : ");
        quantidade = sc.nextInt();
        System.out.println("Dinheiro recebido : ");
        dinheiroCli = sc.nextDouble();
        sc.close();

        precoTotal = precoUni * quantidade;
        troco = dinheiroCli - precoTotal;

        System.out.println("TROCO = " + troco);

    }
}
