public class CreditCard extends Card {

    private final double creditLimit;
    private double creditBalance;

    public CreditCard(String name, double creditBalance, double creditLimit) {
        super(name, creditBalance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void addCash(double cash) {
        if (cash > creditLimit - creditBalance) {
            double excess = cash - (creditLimit - creditBalance);
            creditBalance += cash - excess;
            super.addCash(excess);
        } else creditBalance += cash;
    }

    @Override
    public void Buy(double sum) {
        if (sum < getBalance()) super.Buy(sum);
        else if (sum <= getBalance() + creditLimit - creditBalance) {
            double amountToCredit = sum - getBalance();
            super.Buy(getBalance());
            creditBalance += amountToCredit;
        } else {
            System.out.println("Недостаточно средств, как на балансе, так и в кредитном лимите!");
        }
    }

    @Override
    public String cardInfo() {
        return super.cardInfo() + String.format(" Кредитный баланс(задолжность): %.2f, Кредитный лимит %.2f", creditBalance, creditLimit);
    }


}


