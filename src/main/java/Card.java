public class Card {

    private final String name;
    private double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String cardInfo() {
        return String.format("Имя карты: %s, Баланс: %.2f",
                name, balance);
    }

    public double getBalance() {
        return balance;
    }


    public void Buy(double sum) {
        if (sum > balance) System.out.println("Недостаточно средств!");
        else {
            balance += sum;
        }
    }

    public void addCash(double cash) {
        balance += +cash;
    }


}
