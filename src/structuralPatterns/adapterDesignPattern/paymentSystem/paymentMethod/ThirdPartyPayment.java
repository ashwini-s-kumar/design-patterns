package structuralPatterns.adapterDesignPattern.paymentSystem.paymentMethod;

public class ThirdPartyPayment {
    // This class is incompatible with the Payment interface
    // so, this is a Adaptee, which needs Adapter.
    public void processCreditCardPayment(int amount){
        System.out.println("The payment done using credit card :"+amount);
    }
    public void processGooglePayment(int amount){
        System.out.println("The payment done using GooglePay :"+amount);
    }
    public void processPaypalPayment(int amount){
        System.out.println("The payment done using Paypal :"+amount);
    }
}
