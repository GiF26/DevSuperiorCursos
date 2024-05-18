package src;

import java.util.Scanner;

public class TempoDeJogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int	horaIni = 0, horaFim = 0, horaTot = 0; 
		
		System.out.println("Digite a hora inicial e a hora que o jogo terminou :");
		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		sc.close();
		
		if (horaIni > horaFim) {
			horaTot = (24 - horaIni) + horaFim;
		}else {
			horaTot = horaIni + (24 - horaFim);
		}
		System.out.println("Voce jogou por = " + horaTot + "Horas");
	}
}
