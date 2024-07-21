package Combate.src;

import Combate.Objects.Champion;

import java.util.Scanner;

public class Application {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Champion champOne = new Champion();
        Champion champTwo = new Champion();

        criaObjetos(champOne);
        criaObjetos(champTwo);

        System.out.println("How many turns do you want to execute?");
        int turns = sc.nextInt();

        for(int i = 0; i < turns; i++){
            champOne.takeDamage(champTwo);
            champTwo.takeDamage(champOne);

            System.out.println("\nResult of turn " + (i + 1) + ":" );
            System.out.println(champOne.status());
            System.out.println(champTwo.status());

            if(champOne.getLife() == 0 || champTwo.getLife() == 0){
                break;
            }
        }

        System.out.println("FIM DO COMBATE");
    }

    public static void criaObjetos(Champion obj){
        System.out.println("Enter the details of the first champion:");
        System.out.println("Name: ");
        obj.setName(sc.nextLine());
        System.out.println("Initial life: ");
        obj.setLife(sc.nextInt());
        System.out.println("Atack: ");
        obj.setAtack(sc.nextInt());
        System.out.println("Armor: ");
        obj.setArmor(sc.nextInt());
        sc.nextLine();

        obj = new Champion(obj.getName(), obj.getLife(), obj.getAtack(), obj.getArmor());

    }
}
