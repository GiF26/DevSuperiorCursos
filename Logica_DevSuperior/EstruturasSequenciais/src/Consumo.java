import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        double distanciaTot, totalCombustivel,kmPorCombustivel;

        Scanner sc = new Scanner(System.in);

        System.out.println("Distancia percorrida : ");
        distanciaTot = sc.nextDouble();
        System.out.println("Combustivel gasto : ");
        totalCombustivel = sc.nextDouble();
        sc.close();

        kmPorCombustivel = distanciaTot/totalCombustivel;

        System.out.println("\nConsumo médio : " + kmPorCombustivel);

    }
}
