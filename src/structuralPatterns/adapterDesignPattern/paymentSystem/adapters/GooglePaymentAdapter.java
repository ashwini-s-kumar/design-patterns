package structuralPatterns.adapterDesignPattern.paymentSystem.adapters;

import structuralPatterns.adapterDesignPattern.paymentSystem.payment.Payment;
import structuralPatterns.adapterDesignPattern.paymentSystem.paymentMethod.ThirdPartyPayment;

public class GooglePaymentAdapter implements Payment {
    ThirdPartyPayment thirdPartyPayment;

    public GooglePaymentAdapter(ThirdPartyPayment thirdPartyPayment){
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void processPayment(String paymentType, int amount) {
        if(paymentType.equalsIgnoreCase("GooglePay")){
            thirdPartyPayment.processGooglePayment(amount);
        }
    }
}
