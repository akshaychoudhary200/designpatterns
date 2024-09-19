package strategypattern;


// context class that reference current strategy and can change stratgies or payment methods at runtime
public class PayService {
    private PaymentStrategy paymentStrategy;

    public PayService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
