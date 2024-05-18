import java.util.Scanner;

//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
//telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
//ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.

public class Operadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int minutos = 0;
		double minutosPreco = 0, minutosAddPreco = 0;
		
		System.out.println("Digite a quantidade de minutos:");
		minutos = sc.nextInt();
		sc.close();

		if (minutos <= 100) {
			minutosPreco = 50;
			System.out.println("Valor a pagar: " + minutosPreco );
		}else {
			minutosAddPreco = minutos  *  2;
			System.out.println("Valor a pagar: " + (minutosAddPreco - 100));
		}
		
	}
}
