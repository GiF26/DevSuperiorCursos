
public class Conta {
    private final int nroConta;
    private String nomeTitular;
    private double saldo;

    public int getNroConta() {
        return nroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(String nomeTitular, int nroConta, double depositoInicial) {
        setNomeTitular(nomeTitular);
        this.nroConta = nroConta;
        deposito(depositoInicial);
    }

    public Conta(String nomeTitular, int nroConta) {
        setNomeTitular(nomeTitular);
        this.nroConta = nroConta;
    }

    public void deposito(double valorDeposito){
        saldo += valorDeposito;
    }

    public void saque(double valorSaque){
        saldo -= valorSaque + 5;
    }

}
