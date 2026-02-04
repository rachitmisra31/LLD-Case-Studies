package designpatterns.behaviour.strategy;

public class PayPal implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment processed through  paypal!---");
    }
}
