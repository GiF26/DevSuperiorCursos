package ex2.Objects;

public final class ImportedProduct extends Product{
    private Double customsFee;

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder s = new StringBuilder();
        s.append(super.name + " $ " + totalPrice() + " (Customs fee: $ " + customsFee + ")" );
        return s.toString();
    }

    public double totalPrice(){
        return price + customsFee;
    }
}
