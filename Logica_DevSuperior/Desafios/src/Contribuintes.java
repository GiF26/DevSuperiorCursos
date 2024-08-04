import java.util.Scanner;

public class Contribuintes {
    static double impSal = 0,
     impServ = 0,
     impGC = 0,
     impBruto = 0,
     abate = 0,
     rendaSalario = 0,
            rendaPretacaoServ = 0,
            rendaGanhoCapital = 0,
            gastosMedicos = 0,
            gastosEducacionais = 0;

    public static void EntradaDeDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do contribuinte:");
        System.out.println("Renda anual com salário:");
        rendaSalario = sc.nextDouble();
        System.out.println("Renda anual com prestação de serviço:");
        rendaPretacaoServ = sc.nextDouble();
        System.out.println("Renda anual com ganho de capital:");
        rendaGanhoCapital = sc.nextDouble();
        System.out.println("Gastos Medicos");
        gastosMedicos = sc.nextDouble();
        System.out.println("Gastos Educacionais");
        gastosEducacionais = sc.nextDouble();
        sc.close();
    }
    public static double ImpostoSobreSalario(double renda) {
        double calculo = 0;
        double salarioPorMes = renda / 12;

        if (salarioPorMes < 3000) {
            System.out.println("Isento");
        }
        else if (salarioPorMes <= 5000) {
            calculo = renda * 0.10;
        }
        else {
            calculo = renda * 0.20;
        }

        return  calculo;
    }

    public static double ImpostoSobreServicos(double renda){
        double calculo = 0;
        calculo = renda * 0.15;
        return  calculo;
     }

     public static double ImpostoSobreGC(double renda){
        double calculo = 0;
        calculo = renda * 0.20;
        return calculo;
     }

     public static double ImpostoBrutoTotal(double salario, double servicos, double gc){
         double calculoImpostoBruto = salario + servicos + gc;
         return calculoImpostoBruto ;
     }

     public static double Abatimento(double salario, double servicos, double gc, double gm, double ge){
        double calculoAbatimento = 0;
        double calculoGastos = gm + ge;
        double impBruto = ImpostoBrutoTotal(impSal ,impServ, impGC);
        double limiteAbate = impBruto * 0.30;

        if(calculoGastos < limiteAbate){
            calculoAbatimento = calculoGastos;
        }else {
            calculoAbatimento = limiteAbate;
        }
        return calculoAbatimento ;
     }

     public static void Calculos(){
         impSal = ImpostoSobreSalario(rendaSalario);
         impServ = ImpostoSobreServicos(rendaPretacaoServ);
         impGC = ImpostoSobreGC(rendaGanhoCapital);
         impBruto = ImpostoBrutoTotal(impSal,impServ,impGC);
         abate = Abatimento(rendaSalario,rendaPretacaoServ,rendaGanhoCapital,gastosMedicos,gastosEducacionais);
     }

    public static void relatorioImp() {
        double calculoImpDevido = impBruto - abate;

        System.out.println("RELATÓRIO");
        System.out.println("Imposto sobre salário: " + limitaCasasDeci(impSal) );
        System.out.println("Imposto sobre serviços: " + limitaCasasDeci(impServ));
        System.out.println("Imposto sobre ganho de capital: " + limitaCasasDeci(impGC));
        System.out.println("Imposto bruto total: " + limitaCasasDeci(impBruto));
        System.out.println("Abatimento: " + limitaCasasDeci(abate));
        System.out.println("Imposto devido: " + limitaCasasDeci(calculoImpDevido));
    }

    public static String limitaCasasDeci(double valor) {
        // Formata o valor para duas casas decimais
        String formata = String.format("%.2f", valor);

        // Retorna o valor formatado como double
        return formata;
    }

    public static void main(String[] args) {
        EntradaDeDados();
        Calculos();
        relatorioImp();
    }

}
