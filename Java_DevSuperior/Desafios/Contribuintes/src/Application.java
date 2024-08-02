package Contribuintes.src;

import Contribuintes.Objects.Contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            List<Contribuintes> contribuintesList = new ArrayList<>();

            System.out.println("Quantos contrbuintes voce vai digitar?");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++){
                System.out.println("Digite os dados do " + (i + 1) + "o contribuinte");
                System.out.println("Renda anual com salario:");
                double salaryIncome = sc.nextDouble();
                System.out.println("Renda anual com prestação de serviços:");
                double servicesIncome = sc.nextDouble();
                System.out.println("Renda anual com ganho de capital:");
                double capitalIncome = sc.nextDouble();
                System.out.println("Gastos Médicos:");
                double healthSpendig = sc.nextDouble();
                System.out.println("Gastos Educacionais:");
                double educacionalSpendig = sc.nextDouble();

                contribuintesList.add(new Contribuintes(salaryIncome,servicesIncome,capitalIncome,healthSpendig,educacionalSpendig));
            }

            for (int i = 0; i < n; i++){
                System.out.println("Resumo do " + ( i + 1) + "o contribuinte:");
                Contribuintes o = contribuintesList.get(i);

                System.out.println("Imposto bruto total: " + o.grossTax());
                System.out.println("Abatimento: " + o.taxRebate());
                System.out.println("Imposto Devido: " + o.netTax());
            }


        }
    }
}
