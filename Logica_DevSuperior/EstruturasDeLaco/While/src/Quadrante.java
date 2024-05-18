package src;

import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
//sistema cartesiano.
//Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4).
//O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
//(nesta situação sem escrever mensagem alguma).

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0 , y = 0 , z = 0 ;

        System.out.print("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Quadrante Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrante Q2");
            }else if (x < 0 && y < 0) {
                System.out.println("Quadrante Q3");
            }else if (x > 0 && y < 0) {
                System.out.println("Quadrante Q4");
            }

            System.out.print("Digite o valor de x: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de y: ");
            y = sc.nextInt();

        }
        sc.close();
    }
}
