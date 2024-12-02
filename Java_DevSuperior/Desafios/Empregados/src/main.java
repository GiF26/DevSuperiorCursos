package Empregados.src;

import Empregados.objects.address;
import Empregados.objects.department;
import Empregados.objects.employee;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            department dep = new department();
            System.out.println("Nome do departamento:");
            dep.setName(sc.next());
            System.out.println("Dia do pagamento");
            dep.setPayDay(sc.nextInt());

            address ad = new address();
            System.out.println("Email");
            ad.setEmail(sc.next());
            System.out.println("Telefone");
            ad.setPhone(sc.next());

            System.out.println("Quantos funcionarios tem o departamento?");
            int qtd = sc.nextInt();
            for (int i = 0; i < qtd; i++) {
                employee emp = new employee();
                System.out.println("Dados do funcionario " + (i + 1));
                System.out.println("Nome:");
                emp.setName(sc.next());
                sc.nextLine();
                System.out.println("Salario");
                emp.setSalary(sc.nextDouble());
                dep.addEmploye(emp);
            }

            System.out.println("FOLHA DE PAGAMENTO:");
            System.out.println("Departamento Vendas = R$ " + dep.payroll());
            System.out.println("Pagamento realizado no dia " + dep.getPayDay());
            System.out.println("Funcionarios:");
            for(employee o : dep.getEmployees()){
                System.out.println(o.getName());
            }
            System.out.println("Para duvidas favor entrar em contato: vendas@lojatop.com ");
        }
    }
}
