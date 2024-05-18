package For.src;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){

            System.out.println("Digite um numero");
            int x = sc.nextInt();
            montaFrase(x);
        }
    }

    public static String montaFrase(int num){
        String parImpar = null, posNegativo = null, fraseCompleta = null;

        if(num % 2 == 0){
            parImpar = "PAR ";
        } else {
            parImpar = "IMPAR ";
        }

        if (num == 0){
            fraseCompleta = "NULO";
        }

        if(num > 0){
            posNegativo = "POSITIVO";
        }else{
            posNegativo = "NEGATIVO";
        }

        if(fraseCompleta != null){
            fraseCompleta = parImpar + posNegativo;
        }

        return fraseCompleta;
    }
}
