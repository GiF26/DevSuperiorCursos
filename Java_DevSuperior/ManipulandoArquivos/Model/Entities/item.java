package Entities;

public class item {
    private String nome;
    double precoUnitario;
    int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public item() {
    }

    public item(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double valorTotal(){
        return getPrecoUnitario() * getQuantidade();
    }



    @Override
    public String toString() {
        return getNome() + ","
                + getPrecoUnitario() + ","
                + getQuantidade();
    }
}
