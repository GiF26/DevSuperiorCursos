import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha os dados para a criacao da conta");
        System.out.println("Nome do titular");
        Conta.setNomeTitular(sc.nextLine());
        System.out.println("Deseja fazer deposito inicial? Pressione 1 para sim e 0 para nao");
        int decisao = sc.nextInt();

        if(decisao == 1){
            System.out.println("De quanto gostaria de depositar ?");
            Conta.deposito(sc.nextDouble());

            new Conta(Conta.getNomeTitular(),26003005, Conta.getSaldo() );
            System.out.println("Sua conta foi criada e seus dados sao : " +
                    "\nTitular: " + Conta.getNomeTitular() +
                    "\nNumero da Conta: " + Conta.getNroConta() +
                    "\nDeposito inicial: + R$" + Conta.getSaldo());
        }else{
            new Conta(Conta.getNomeTitular(),26003005);
            System.out.println("Sua conta foi criada e seus dados sao : " +
                    "\nTitular: " + Conta.getNomeTitular() +
                    "\nNumero da Conta: " + Conta.getNroConta());
        }


    }
}
