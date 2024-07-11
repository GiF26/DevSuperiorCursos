import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha os dados para a criacao da conta");
        System.out.println("Nome do titular");
        Conta.setNomeTitular(sc.nextLine());

        System.out.println("Deseja fazer deposito inicial? Pressione 1 para nao e 2 para sim");
        int decisao = sc.nextInt();

            switch (decisao){
                case 1:
                    System.out.println("De quanto gostaria de depositar ?");
                    Conta.deposito(sc.nextDouble());

                    new Conta(Conta.getNomeTitular(),26003005);
                    System.out.println("Sua conta foi criada e seus dados sao : " +
                            "\nTitular: " + Conta.getNomeTitular() +
                            "\nNumero da Conta: " + Conta.getNroConta());
                    break;
                case 2:
                    new Conta(Conta.getNomeTitular(),26003005, Conta.getSaldo() );
                    System.out.println("Sua conta foi criada e seus dados sao : \n" +
                            "\nTitular: " + Conta.getNomeTitular() +
                            "\nNumero da Conta: " + Conta.getNroConta() +
                            "\nDeposito inicial: + R$" + Conta.getSaldo()) ;
            }

        while (decisao != 0){
            System.out.println("\nDigite:" +
                    " \n1 para realizar um saque;" +
                    " \n2 para realizar um deposito;" +
                    " \n0 para sair");
            decisao = sc.nextInt();

            switch (decisao){
                case 1:
                    Conta.saque(sc.nextDouble());
                    System.out.println("Titular: " + Conta.getNomeTitular() +
                            "\nNumero da Conta: " + Conta.getNroConta() +
                            "\nSaldo Atual: " + Conta.getSaldo());
                    break;
                case 2:
                    Conta.deposito(sc.nextDouble());
                    System.out.println("Titular: " + Conta.getNomeTitular() +
                            "\nNumero da Conta: " + Conta.getNroConta() +
                            "\nSaldo Atual: " + Conta.getSaldo());
                    break;
                default:
                    System.out.println("Voce saiu da conta!");
                    decisao = 0;
                    break;
            }
        }

    }
}
