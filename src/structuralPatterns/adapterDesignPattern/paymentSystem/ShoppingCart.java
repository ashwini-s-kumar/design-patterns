package structuralPatterns.adapterDesignPattern.paymentSystem;

import structuralPatterns.adapterDesignPattern.paymentSystem.adapters.CreditCardPaymentAdapter;
import structuralPatterns.adapterDesignPattern.paymentSystem.adapters.GooglePaymentAdapter;
import structuralPatterns.adapterDesignPattern.paymentSystem.adapters.PaypalPaymentAdapter;
import structuralPatterns.adapterDesignPattern.paymentSystem.payment.Payment;
import structuralPatterns.adapterDesignPattern.paymentSystem.paymentMethod.ThirdPartyPayment;

public class ShoppingCart {
    Payment payment;

    public ShoppingCart(Payment payment){
        this.payment = payment;
    }

    public void checkout(String paymentType, int amount){
        payment.processPayment(paymentType, amount);
    }
}
