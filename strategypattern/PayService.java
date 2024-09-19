package strategypattern;

public class PayService {
    private PaymentStrategy paymentStrategy;

    public PayService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
