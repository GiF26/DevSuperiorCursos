
public class Conta {
    private static int nroConta;
    private static String nomeTitular;
    private static double saldo;

    public static int getNroConta() {
        return Conta.nroConta;
    }

    public static String getNomeTitular() {
        return nomeTitular;
    }

    public static void setNomeTitular(String nomeTitular) {
        Conta.nomeTitular = nomeTitular;
    }

    public static double getSaldo() {
        return saldo;
    }

    private static void setSaldo(double saldo) {
        Conta.saldo = saldo;
    }

    public Conta(String nomeTitular, int nroConta, double depositoInicial) {
        setNomeTitular(nomeTitular);
        Conta.nroConta = nroConta;
        setSaldo(depositoInicial);
    }

    public Conta(String nomeTitular, int nroConta) {
        setNomeTitular(nomeTitular);
        Conta.nroConta = nroConta;
    }

    public static void deposito(double valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
    }

    public static void saque(double valorSaque){
        setSaldo(getSaldo() - valorSaque - 5);
    }
}
