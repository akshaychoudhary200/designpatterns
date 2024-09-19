package strategypattern;

public class CreditCardStrategy implements PaymentStrategy {
    String name;
    long cardNumber;

    public CreditCardStrategy(String name , long cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("pay through credit card " + amount);
    }
}
