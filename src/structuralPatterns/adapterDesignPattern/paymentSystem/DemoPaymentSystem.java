package structuralPatterns.adapterDesignPattern.paymentSystem;

import structuralPatterns.adapterDesignPattern.paymentSystem.adapters.CreditCardPaymentAdapter;
import structuralPatterns.adapterDesignPattern.paymentSystem.adapters.GooglePaymentAdapter;
import structuralPatterns.adapterDesignPattern.paymentSystem.adapters.PaypalPaymentAdapter;
import structuralPatterns.adapterDesignPattern.paymentSystem.payment.Payment;
import structuralPatterns.adapterDesignPattern.paymentSystem.paymentMethod.ThirdPartyPayment;

public class DemoPaymentSystem {
    public static void main(String [] arr){

        ThirdPartyPayment thirdPartyPayment = new ThirdPartyPayment();

        Payment creditCardPaymentAdapter = new CreditCardPaymentAdapter(thirdPartyPayment);
        Payment googlePaymentAdapter = new GooglePaymentAdapter(thirdPartyPayment);
        Payment paypalPaymentAdapter = new PaypalPaymentAdapter(thirdPartyPayment);

        ShoppingCart shoppingCart = new ShoppingCart(creditCardPaymentAdapter);
        shoppingCart.checkout("CreditCard", 1000);

        shoppingCart = new ShoppingCart(googlePaymentAdapter);
        shoppingCart.checkout("GooglePay", 5000);

        shoppingCart = new ShoppingCart(paypalPaymentAdapter);
        shoppingCart.checkout("Paypal", 3000);
    }
}
