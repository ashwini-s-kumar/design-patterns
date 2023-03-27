package structuralPatterns.adapterDesignPattern.paymentSystem.adapters;

import structuralPatterns.adapterDesignPattern.paymentSystem.payment.Payment;
import structuralPatterns.adapterDesignPattern.paymentSystem.paymentMethod.ThirdPartyPayment;

public class CreditCardPaymentAdapter implements Payment {
    ThirdPartyPayment thirdPartyPayment;

    public CreditCardPaymentAdapter(ThirdPartyPayment thirdPartyPayment){
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void processPayment(String paymentType, int amount) {
        if(paymentType.equalsIgnoreCase("CreditCard")){
            thirdPartyPayment.processCreditCardPayment(amount);
        }
    }
}
