package oopspractice;

public class Upi implements PaymentMethod {

    private String upiId;
    public Upi(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Payment done via upi with upi Id "+upiId);
    }
}