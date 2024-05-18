package src;

import java.util.Scanner;

public class TrocoVerificado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double precoUni = 0, qtd = 0, troco = 0, precoPago = 0, precoTotal = 0;
		
		System.out.println("Preço unitario do produto: ");
		precoUni = sc.nextDouble();
		System.out.println("Quantidade comprada");
		qtd = sc.nextDouble();
		System.out.println("Dinheiro recebido");
		precoPago = sc.nextDouble();
		sc.close();
		
		precoTotal = precoUni * qtd;
		troco = precoPago - precoTotal;
		
		if (precoPago < precoTotal) {
			System.out.println("Dinheiro não suficiente, faltam = "  + (precoTotal - precoPago) + " reais!");
		}else {
			System.out.println("TROCO = " + troco);
		}
	}
}
