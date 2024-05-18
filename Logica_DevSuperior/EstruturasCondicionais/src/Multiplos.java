
//Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
//números podem ser digitados em qualquer ordem.

import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		sc.close();

		if (n1 % n2 == 0 || n2 % n1 == 0){
			System.out.println("É MULTIPLO");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
	}
}
