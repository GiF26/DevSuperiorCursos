package While.src;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoCombu = 0 ,
                alcool = 0,
                gasolina = 0,
                diesel = 0;

        while(tipoCombu != 4){
            System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar:");
            tipoCombu = sc.nextInt();

            if(tipoCombu <= 0 || tipoCombu > 4){
                System.out.println("Codigo Invalido! Tente novamente :");
                tipoCombu = sc.nextInt();
            }
            sc.close();

            switch (tipoCombu){
                case 1 :
                    alcool++;
                    break;
                case 2 :
                    gasolina++;
                    break;
                case 3 :
                    diesel ++;
                    break;
                default:
                    System.out.println("Muito obrigado");
            }
        }
        System.out.println("1.Alcool = " + alcool);
        System.out.println("2.Gasolina = " + gasolina);
        System.out.println("3.Diesel = " + diesel);
    }
}
