public class SavingCard extends Card {

    private double savings;
    private double balance;


    public SavingCard(String name, double balance) {
        super(name, balance);
        this.balance = balance;
    }

    @Override
    public void addCash(double cash) {
        balance += +cash;
        savings += cash * 0.0005;
    }

    @Override
    public String cardInfo() {
        return super.cardInfo() + String.format(" Баланс накоплений: %.2f", savings);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
