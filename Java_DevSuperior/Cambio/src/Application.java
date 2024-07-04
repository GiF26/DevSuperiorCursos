//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
//Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
//Criar uma classe CurrencyConverter para ser responsável pelos cálculos.

//Qual o valor do dólar? 3.10
//Quantos dólares serão comprados? 200.00
//Valor a ser pago em reais = 657.20

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dolar?");
        Cambio.dolar = sc.nextDouble();
        System.out.println("Quantos dolares serao comprados?");
        Cambio.qtdDolares = sc.nextInt();
        System.out.println("Valor a ser pago em reais = " + Cambio.cambioReais());
    }
}
