public class BonusCard extends Card {
    private double bonus;
    private double balance;

    public BonusCard(String name, double balance) {
        super(name, balance);
        this.balance = balance;
    }

    @Override
    public void Buy(double sum) {
        if (sum > balance) System.out.println("Недостаточно средств!");
        else {
            balance += sum;
            bonus += sum * 0.01;
        }
    }

    @Override
    public String cardInfo() {
        return super.cardInfo() + String.format(" Бонусный баланс: %.2f", bonus);
    }

}
