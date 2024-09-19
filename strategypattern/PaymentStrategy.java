package strategypattern;


// common interface for all concrete strategy
public interface PaymentStrategy {
     void pay(int amount);
}
