//package src;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        double difMin = 0;

        String[] nome = new String[5];
        String[] telefone = new String[5];
        int[] tipo = new int[5];
        int[] minutos = new int[5];
        double[] valorDaConta = new double[5];
        double[][] preco = new double[3][2];

        System.out.println("Informe a quantidade de clientes");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
        	sc.nextLine();
            System.out.println("Dados do " + (i + 1) + "o. cliente:" );
            System.out.println("Nome:");
            nome[i] = sc.nextLine();
            System.out.println("Telefone:");
            telefone[i] = sc.next();
            System.out.println("Tipo:");
            tipo[i] = sc.nextInt();
            System.out.println("Minutos:");
            minutos[i] = sc.nextInt();
        }

        System.out.println("Informe o preco basico e excedente de cada tipo de conta:");
        for (int i = 0; i < 3; i++){
            System.out.println("Tipo " + i + ":");
            for (int j = 0; j < 2; j++ ){
                preco[i][j] = sc.nextDouble();
            }
        }

        sc.close();

        for (int i = 0; i < 4; i++) {
            if (minutos[i] <= 90){
                valorDaConta[i] = preco[tipo[i]][0];
            }else{
                difMin = minutos[i] - 90;
                valorDaConta[i] = preco[tipo[i]][0] + (difMin * preco[tipo[i]][1]);
            }
        }

        System.out.println();
        System.out.println("RELATÓRIO DE CLIENTES:");
        System.out.println();
        
        for (int i = 0; i < n; i++ ){
            System.out.println(nome[i]
                    + ", " + telefone[i]
                    + ", " + "Tipo " + tipo[i]
                    + ", " + "Minutos " + minutos[i]
                    + ", " + "Conta = R$ " + valorDaConta[i]);
        }


    }
}
