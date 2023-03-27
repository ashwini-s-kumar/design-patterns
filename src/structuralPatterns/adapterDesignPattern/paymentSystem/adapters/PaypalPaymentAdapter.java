package structuralPatterns.adapterDesignPattern.paymentSystem.adapters;

import structuralPatterns.adapterDesignPattern.paymentSystem.payment.Payment;
import structuralPatterns.adapterDesignPattern.paymentSystem.paymentMethod.ThirdPartyPayment;

public class PaypalPaymentAdapter implements Payment {
    ThirdPartyPayment thirdPartyPayment;

    public PaypalPaymentAdapter(ThirdPartyPayment thirdPartyPayment){
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void processPayment(String paymentType, int amount) {
        if(paymentType.equalsIgnoreCase("Paypal")){
            thirdPartyPayment.processPaypalPayment(amount);
        }
    }
}
