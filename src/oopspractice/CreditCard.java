package oopspractice;

public class CreditCard implements PaymentMethod {

    String cardNumber;
    String name;

    @Override
    public void pay() {
        System.out.println("Payment done via Credit Card for "+cardNumber+" and "+name);
    }

    public CreditCard(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }
}
