import java.util.Scanner;

//Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
//isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
//informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
//
//duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
//deduzir a fórmula de Celsius para Fahrenheit): 

public class Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String escala;
		double conversao = 0, temperatura = 0;
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		escala = sc.next();
		sc.close();

		escala = escala.toLowerCase();
		
		if(escala.equals("f")) {
		    System.out.println("Digite a temperatura em Fahrenheit:");
		    temperatura = sc.nextDouble();
		    conversao = (5.0/9.0) * (temperatura - 32);
		    System.out.println("A temperatura em Celsius é: " + conversao);
		} else if (escala.equals("c")) {
		    System.out.println("Digite a temperatura em Celsius:");
		    temperatura = sc.nextDouble();
		    conversao = (9.0/5.0) * temperatura + 32;
		    System.out.println("A temperatura em Fahrenheit é: " + conversao);
		}

		//System.out.println("A temperatura em " + escala + " é : " + Math.round(conversao/100) * 100 );
	}
}

