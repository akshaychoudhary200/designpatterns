package strategypattern;


public class Strategy {
    public static void main(String[] args) {
        PaymentStrategy strategy = new CreditCardStrategy("abc", 2000303);
        PayService payService = new PayService(strategy);
        payService.checkout(200);

        payService = new PayService(new PayPalStrategy("xyz", 41244242));
        payService.checkout(300);
    }
}