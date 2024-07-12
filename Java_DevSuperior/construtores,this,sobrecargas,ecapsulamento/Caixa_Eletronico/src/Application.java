import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 ;

        System.out.println("Preencha os dados para a criacao da conta1");
        System.out.println("Nome do titular");
        String nomeTitular = sc.nextLine();

        System.out.println("Deseja fazer deposito inicial? Pressione 1 para nao e 2 para sim");
        int decisao = sc.nextInt();

            switch (decisao){
                case 1:
                    System.out.println("De quanto gostaria de depositar ?");
                    conta1.deposito(sc.nextDouble());

                    conta1 = new Conta(conta1.getNomeTitular(),26003005);
                    System.out.println("Sua conta1 foi criada e seus dados sao : " +
                            "\nTitular: " + conta1.getNomeTitular() +
                            "\nNumero da conta1: " + conta1.getNroConta());
                    break;
                case 2:
                    conta1 = new Conta(conta1.getNomeTitular(),26003005, conta1.getSaldo() );
                    System.out.println("Sua conta1 foi criada e seus dados sao : \n" +
                            "\nTitular: " + conta1.getNomeTitular() +
                            "\nNumero da conta1: " + conta1.getNroConta() +
                            "\nDeposito inicial: + R$" + conta1.getSaldo()) ;
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

                    conta1.saque(sc.nextDouble());
                    System.out.println("Titular: " + conta1.getNomeTitular() +
                            "\nNumero da conta1: " + conta1.getNroConta() +
                            "\nSaldo Atual: - R$" + conta1.getSaldo());
                    break;
                case 2:
                    conta1.deposito(sc.nextDouble());
                    System.out.println("Titular: " + conta1.getNomeTitular() +
                            "\nNumero da conta1: " + conta1.getNroConta() +
                            "\nSaldo Atual: + R$" + conta1.getSaldo());
                    break;
                default:
                    System.out.println("Voce saiu da conta1!");
                    decisao = 0;
                    break;
            }
        }

    }
}
