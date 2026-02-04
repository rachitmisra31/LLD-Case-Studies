package designpatterns.behaviour.strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Payment processed through credit card!---");
    }
}
