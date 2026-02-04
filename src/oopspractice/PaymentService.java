package oopspractice;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    Map<String, PaymentMethod> paymentType = new HashMap<>();


    public void addPaymentMethod(String name,PaymentMethod paymentTMethod) {
        paymentType.put(name, paymentTMethod);
    }

    public void makePayment(String name) {
//        for (Map.Entry<String, PaymentMethod> entry : paymentType.entrySet()) {
//            entry.getValue().pay();
//        }
        PaymentMethod paymentMethod = paymentType.get(name);
        paymentMethod.pay();
    }
}
