public interface PaymentProcessor {
    void processPayment(double amount);
    boolean verifyPayment(String transactionId);
    void refundPayment(String transactionId, double amount);
}