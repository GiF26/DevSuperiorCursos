import java.util.Scanner;

public class Lanchonete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = 0 ,
			qtd = 0;
		
		double preco = 0, precoTot;
		
		System.out.println("Código do produto comprado: ");
		codigo = sc.nextInt();
		
		switch (codigo){
			case 1 : 
				preco = 5;
				break;
			case 2 : 
				preco = 3.50;
				break;
			case 3 : 
				preco = 4.80;
				break;
			case 4 : 
				preco = 8.90;
				break;
			case 5 : 
				preco = 7.32;
				break;
			default:
				System.out.println("Código inválido !");
				break;
		}
		
		System.out.println("Digite a quantidade comprada: ");
		qtd = sc.nextInt();
		sc.close();
		
		precoTot = qtd * preco;
		
		System.out.println("Valor a pagar = " + precoTot);
		
		
	}
}
