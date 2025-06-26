public class Main {

    public static void main(String[] args) {

        Card card1 = new Card("Обычная дебетовая карта", 1000.1);
        System.out.println(card1.cardInfo());
        card1.addCash(100);
        card1.Buy(50);
        System.out.println(card1.cardInfo());
        System.out.println("__________________________________________________");
        CreditCard card2 = new CreditCard("Кредитная карта с балансом и кредитным лимитом", 1000, 100000);
        System.out.println(card2.cardInfo());
        card1.addCash(1000);
        card2.Buy(10000);
        System.out.println(card2.cardInfo());
        System.out.println("__________________________________________________");
        BonusCard bonusCard = new BonusCard("Карта с бонусами", 1000);
        System.out.println(bonusCard.cardInfo());
        bonusCard.Buy(100);
        System.out.println(bonusCard.cardInfo());
        System.out.println("__________________________________________________");
        SavingCard savingCard = new SavingCard("Карта с накоплениями при пополнений", 1000);
        System.out.println(savingCard.cardInfo());
        savingCard.addCash(500);
        System.out.println(savingCard.cardInfo());

    }
}
