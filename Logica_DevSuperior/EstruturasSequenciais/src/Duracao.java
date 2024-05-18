import java.util.Scanner;

public class Duracao {

    public static void main(String[] args) {
        int horas, tempoDigitado, minutos ,segundos, resto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duracao em segundos : ");
        tempoDigitado = sc.nextInt();
        sc.close();

        horas = tempoDigitado / 3600;
        resto = tempoDigitado % 3600;
        minutos = resto / 60 ;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
