import java.util.Scanner;

public class Glicose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double qtdGli = 0;
		
		System.out.println("Digite a medida da glicose: ");
		qtdGli = sc.nextInt();
		sc.close();

		if(qtdGli <= 100) {
			System.out.println("Classificacao: normal");
		}else if (qtdGli > 100 && qtdGli <= 140) {
			System.out.println("Classificacao: elevado");
		}else if(qtdGli > 140) {
			System.out.println("Classificacao: diabetes");
		}
	}
}
