package structuralPatterns.facadeDesignPattern.hotelBooking.subClass;

public class PaymentService {
    private boolean paymentComplete;
    public void makePayment(int numOfDays){
        if(numOfDays > 10){
            System.out.println("The payment is not Success.");
            paymentComplete=false;
        }else {
            System.out.println("The payment is Successful !!!");
            paymentComplete = true;
        }
    }

    public boolean isPaymentComplete() {
        return paymentComplete;
    }

    public void setPaymentComplete(boolean paymentComplete) {
        this.paymentComplete = paymentComplete;
    }
}
