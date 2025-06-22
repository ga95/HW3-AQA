public class Card {

    private final String name;
    private double balance;
    private double bonus;
    private double savings;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String cardInfo() {
        return String.format("Имя карты: %s, Баланс: %.2f, Бонусы: %.2f, Накопления: %.2f",
                name, balance, bonus, savings);
    }

    public double getBalance() {
        return balance;
    }

    public double getBonus() {
        return bonus;
    }

    public String getName() {
        return name;
    }

    public void Buy(double sum) {
        if (sum > balance) System.out.println("Недостаточно средств!");
        else {
            balance += sum;
            bonus += sum * 0.01;
        }
    }

    public void addCash(double cash) {
        balance += +cash;
        savings += cash * 0.0005;
    }


}
