public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        setBalance(amount + getBalance());
    }

    public void withdraw(double amount){
        if(amount > getWithdrawLimit()){
            throw new RuntimeException("Withdraw error: The amount exceeds withdraw limit");
        }

        if(amount > getBalance()){
            throw new RuntimeException("Withdraw error: Not enough balance");
        }

        setBalance(getBalance() - amount);
    }
}
