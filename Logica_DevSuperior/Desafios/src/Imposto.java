package src;

import java.util.Scanner;
public class Imposto {
    public static void main(String[] args) {
        double rendaSalario,
                rendaPestSer,
                ganhoCap,
                impSal = 0,
                impPrest = 0,
                impGanhoCap = 0,
                gastosMedicos,
                gastosEducacionais,
                gastosDedutiveis,
                maximoDedutivel,
                impBruto,
                impDevido,
                abatimento;

        //entrada de informacoes
        Scanner sc = new Scanner(System.in);
        System.out.println("Renda anual com salário : ");
        rendaSalario = sc.nextDouble();
        System.out.println("Renda anual com prestação de serviço : ");
        rendaPestSer = sc.nextDouble();
        System.out.println("Renda anual com ganho de capital : ");
        ganhoCap = sc.nextDouble();
        System.out.println("Gastos médicos : ");
        gastosMedicos = sc.nextDouble();
        System.out.println("Gastos educacionais : ");
        gastosEducacionais = sc.nextDouble();
        sc.close();

        //calculos rendas
        if (rendaSalario < 30000){
            System.out.println(" ISENTO ");
        }else if (rendaSalario <= 50000){
            impSal = (rendaSalario * 10) / 100;
        }else {
            impSal = (rendaSalario * 20) / 100;
        }

        if (rendaPestSer > 0){
            impPrest = (rendaPestSer * 15) / 100;
        }

        if (ganhoCap > 0){
            impGanhoCap = (ganhoCap * 20) / 100;
        }

        //dedutiveis e resumo
        gastosDedutiveis = gastosMedicos + gastosEducacionais;
        impBruto = impSal + impPrest + impGanhoCap;
        maximoDedutivel = impBruto * 0.3;

        if (gastosDedutiveis > maximoDedutivel){
            abatimento = maximoDedutivel;
        }else{
            abatimento = gastosDedutiveis;
        }

        impDevido = impBruto - abatimento;

        System.out.println(" RELATÓRIO DE IMPOSTO DE RENDA : ");

        System.out.println(" \n CONSOLIDADO DE RENDA ");
        System.out.println(" Imposto sobre o salário : " + impSal);
        System.out.println(" Imposto sobre serviços : " + impPrest);
        System.out.println(" Imposto sobre ganho de capital :  " + impGanhoCap);

        System.out.println(" \n DEDUÇÕES : ");
        System.out.println(" Máximo dedutivel : " + maximoDedutivel);
        System.out.println(" Gastos dedutiveis : " + gastosDedutiveis);

        System.out.println(" \n RESUMO : ");
        System.out.println(" Imposto bruto total : " + impBruto);
        System.out.println(" Abatimento: " + abatimento);
        System.out.println(" Imposto devido : " + impDevido);

    }
}