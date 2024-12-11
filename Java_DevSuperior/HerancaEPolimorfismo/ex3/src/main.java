package ex3.src;

import ex3.Objects.Contribuinte;
import ex3.Objects.PessoaFisica;
import ex3.Objects.PessoaJuridica;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ArrayList<Contribuinte> contribuintes = new ArrayList<>();

            System.out.println("Enter the number of tax payers:");
            int qtd = sc.nextInt();
            sc.nextLine();

            for(int i = 0; i < qtd; i++){

                System.out.println("Tax payer " +  (i+1) + " data:");
                System.out.println("Individual or company (i/c)");
                char decision = sc.next().charAt(0);
                System.out.println("Name:");
                String nome = sc.next();
                System.out.println("Anual Income:");
                double annualIncome = sc.nextDouble();

                if(decision == 'i'){
                    System.out.println("Health expenditures");
                    double healthSpend = sc.nextDouble();
                    PessoaFisica pf = new PessoaFisica(nome, annualIncome, healthSpend);
                    contribuintes.add(pf);
                }else{
                    System.out.println("Number of employees");
                    int numberEmp = sc.nextInt();
                    PessoaJuridica pj = new PessoaJuridica(nome, annualIncome, numberEmp);
                    contribuintes.add(pj);
                }
            }

            double totalTaxes = 0;
            System.out.println("TAXES PAID:");
            for(Contribuinte o : contribuintes){
                System.out.println(o.getNome() + " : $" + o.calculoImposto());
                totalTaxes += o.calculoImposto();
            }

            System.out.println();
            System.out.println("Total taxes: $" + totalTaxes);
        }
    }
}
