import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario = 0,
                nvSal = 0,
                aumento = 0,
                aumentoPercentagem = 0;

        System.out.println("Digite o salario da pessoa");
        salario = sc.nextDouble();
        sc.close();

        if (salario <= 1000){
            aumento = (salario * 20) / 100;
        } else if (salario <= 3000) {
            aumento = (salario * 15) / 100;
        } else if (salario <= 8000) {
            aumento = (salario * 10) / 100;
        }

        nvSal = salario + aumento;
        aumentoPercentagem =  aumento * 100 / salario ;

        System.out.println("novo salario : " + nvSal);
        System.out.println("aumento : " + aumento );
        System.out.println("Porcentagem : " + aumentoPercentagem + "%");

    }
}
