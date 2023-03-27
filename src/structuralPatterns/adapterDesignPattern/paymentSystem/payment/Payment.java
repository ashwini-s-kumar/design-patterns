package structuralPatterns.adapterDesignPattern.paymentSystem.payment;

public interface Payment {
    void processPayment(String paymentType, int amount);
}
