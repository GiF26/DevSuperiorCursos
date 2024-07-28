package Comerciante.src;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            double lucro = 0.0, valorTotalV = 0.0, valorTotalC = 0.0;
            int abaixo = 0, entre = 0, acima = 0;

            System.out.println("Quantas pessoas serao digitadas ?");
            int n = sc.nextInt();

            String[] nome = new String[n];
            double[] precoCompra = new double[n];
            double[] precoVenda = new double[n];

            for(int i = 0; i < n; i++){
                sc.nextLine();
                System.out.println("Produto " + (i +1));
                System.out.println("Nome: ");
                nome[i] = sc.nextLine();
                System.out.println("Preco de compra");
                precoCompra[i] = sc.nextDouble();
                System.out.println("Preco de venda");
                precoVenda[i] = sc.nextDouble();
            }

            for(int i = 0; i < n; i++){
                lucro = precoVenda[i] - precoCompra[i];

                if(lucro < (precoCompra[i] * 10)/100){
                    abaixo++;
                } else
                    if (lucro <= (precoCompra[i] * 20)/100) {
                    entre++;
                }else
                    if (lucro > (precoCompra[i] * 20)/100){
                    acima++;
                }

                valorTotalC += precoCompra[i];
                valorTotalV += precoVenda[i];
            }

            double lucroTotal = valorTotalV - valorTotalC;
            System.out.println("\nRELATORIO:");
            System.out.println("Lucro abaixo de 10%:" + abaixo);
            System.out.println("Lucro entre 10% e 20%:" + entre);
            System.out.println("Lucro entre 10% e 20%:" + acima);
            System.out.println("Valor total de compra:" + valorTotalC);
            System.out.println("Valor total de compra:" + valorTotalV);
            System.out.println("Lucro total:" + lucroTotal);
        }
    }
}