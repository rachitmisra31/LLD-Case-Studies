package designpatterns.behaviour.strategy;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCard();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCard);
        paymentProcessor.makePayment();
    }
}