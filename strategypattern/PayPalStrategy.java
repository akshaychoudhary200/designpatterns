package strategypattern;

// concrete implementation of strategy
public class PayPalStrategy implements PaymentStrategy {
    String name;
    long cardNumber;

    public PayPalStrategy(String name , long cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("pay through paypal " + amount);
    }
    
}
