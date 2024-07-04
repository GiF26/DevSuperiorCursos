
//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais.
//Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar.
//Criar uma classe CurrencyConverter para ser responsável pelos cálculos.

public class Cambio {
    public static double dolar;
    public static int qtdDolares;

    public static double cambioReais(){
        double valorDolarIOF = 0.06 * dolar * qtdDolares ;
        double valorDolarBruto = dolar * qtdDolares;
        return valorDolarBruto + valorDolarIOF;
    }
}

//EXERCICIO FEITO DE FORMA ERRADA
//O CERTO SERIA APENAS O IOF COMO STATIC FINAL
//DOLAR E QUANTIDADE SEREM PASSADOS COMO PARAMETRO
//AMBOS DELCARADOS NA CLASSE PRINCIPAL
