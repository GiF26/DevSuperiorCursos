package ex3.Objects;

public final class PessoaFisica extends Contribuinte{
    private double gastosSaude;

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculoImposto() {
        double imposto = 0;
        double abate = 0;

        if(rendaAnual< 20000){
            imposto = rendaAnual * 1.5;
        }else {
            imposto = rendaAnual * 2.5;
        }

        if(gastosSaude > 0){
            abate = gastosSaude * 5.0;
        }
        return imposto - abate;
    }
}
