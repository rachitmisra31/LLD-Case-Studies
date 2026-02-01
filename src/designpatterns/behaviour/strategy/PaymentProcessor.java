package designpatterns.behaviour.strategy;

public class PaymentProcessor {

    private PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void makePayment() {
        paymentStrategy.pay();
    }
}
