import java.util.Scanner;

public class MenorDeTres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = 0, n2 = 0, n3 = 0;

		System.out.println("Primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Primeiro valor: ");
		n2 = sc.nextInt();
		System.out.println("Primeiro valor: ");
		n3 = sc.nextInt();
		sc.close();

		if (n1 < n2 && n1 < n3 || n1 == n2 || n1 == n3) {
			System.out.println("Menor valor: " + n1);
		} else if (n2 < n1 && n2 < n3 || n2 == n1 || n2 == n3) {
			System.out.println("Menor valor: " + n2);
		} else if (n3 < n2 && n3 < n1 || n3 == n1 || n3 == n2) {
			System.out.println("Menor valor: " + n3);
		}

	}
}
