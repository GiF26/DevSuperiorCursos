package ex3.Objects;

public final class PessoaJuridica extends Contribuinte{
    private int numFuncionarios;

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double calculoImposto() {
        double imposto = 0;

        if(numFuncionarios > 10){
            imposto = super.rendaAnual * 1.4;
        }else{
            imposto = super.rendaAnual * 1.6;
        }

        return imposto;
    }


}
