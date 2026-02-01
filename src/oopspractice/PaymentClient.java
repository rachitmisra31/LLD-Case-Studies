package oopspractice;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("Rachit",new CreditCard("1234567","Rachit"));
        paymentService.addPaymentMethod("RachitUPI",new Upi("1234567"));
        paymentService.makePayment("Rachit");
        paymentService.makePayment("RachitUPI");
//        paymentService.makePayment("Rachit");
    }
}
