import java.util.Scanner;

public class Application {
    public static Conta conta1 ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha os dados para a criacao da conta1");
        System.out.println("Nome do titular");
        String nomeTitular = sc.nextLine();

        System.out.println("Deseja fazer deposito inicial? Pressione 1 para nao e 2 para sim");
        int decisao = sc.nextInt();

            switch(decisao){
                case 1 :
                    conta1 = new Conta(nomeTitular,26003005);
                    System.out.println("\nSua conta foi criada! seus dados sao : " +
                            "\nTitular: " + conta1.getNomeTitular() +
                            "\nNumero da conta: " + conta1.getNroConta());
                    break;

                case 2:
                    conta1 = new Conta(nomeTitular,26003005);
                    System.out.println("De quanto gostaria de depositar ?");
                    conta1.deposito(sc.nextDouble());

                    conta1 = new Conta(nomeTitular, 26003005, conta1.getSaldo());
                    System.out.println("Sua conta foi criada e seus dados sao : \n" +
                            "\nTitular: " + conta1.getNomeTitular() +
                            "\nNumero da conta1: " + conta1.getNroConta() +
                            "\nDeposito inicial: R$" + conta1.getSaldo());
                    break;

                default:
                    System.out.println("Conta nao criada , operação invalida");
                    break;
            }

        while (decisao != 0){

            System.out.println("\nDigite:" +
                    " \n1 para realizar um saque;" +
                    " \n2 para realizar um deposito;" +
                    " \n0 para sair");
            decisao = sc.nextInt();

            switch (decisao){
                case 1:
                    System.out.println("Informe o valor do saque");
                    conta1.saque(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Informe o valor do deposito");
                    conta1.deposito(sc.nextDouble());
                    break;
                default:
                    System.out.println("Voce saiu da conta!");
                    decisao = 0;
                    break;
            }

            System.out.println(conta1);
        }
    }
}



