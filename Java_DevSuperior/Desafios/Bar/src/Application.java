package Bar.src;

import Bar.Objects.Bill;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sexo :");
        Bill.setGender(sc.next()) ;
        System.out.println("Quantidade de cervejas consumidas :");
        Bill.setBeer(sc.nextInt());
        System.out.println("Quantidade de refrigerante consumidos :");
        Bill.setSoftDrink(sc.nextInt());
        System.out.println("Quantidade de espetinhos consumidos :");
        Bill.setBarbecue(sc.nextInt());

        System.out.println("RELATORIO");
        System.out.println("CONSUMO : " + "R$" + Bill.feeding());
        if(Bill.cover() == 0){
            System.out.println("ISENTO DE COUVERT");
        }else{
            System.out.println("COUVERT : " + "R$" + Bill.cover());
        }
        System.out.println("INGRESSO : " + "R$" + Bill.ticket());

        System.out.println("\nValor a pagar: ");
        System.out.println("R$" + Bill.total());


    }
}
