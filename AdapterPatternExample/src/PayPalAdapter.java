public class PayPalAdapter implements PaymentProcessor {
    private final PayPalGateway payPalGateway;
    
    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }
    
    @Override
    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }
    
    @Override
    public boolean verifyPayment(String transactionId) {
        return payPalGateway.checkPaymentStatus(transactionId);
    }
    
    @Override
    public void refundPayment(String transactionId, double amount) {
        payPalGateway.issueRefund(transactionId, amount);
    }
}