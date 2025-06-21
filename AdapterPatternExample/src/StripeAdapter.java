public class StripeAdapter implements PaymentProcessor {
    private final StripeGateway stripeGateway;
    
    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }
    
    @Override
    public void processPayment(double amount) {
        stripeGateway.makePayment(amount);
    }
    
    @Override
    public boolean verifyPayment(String transactionId) {
        return stripeGateway.verifyTransaction(transactionId);
    }
    
    @Override
    public void refundPayment(String transactionId, double amount) {
        stripeGateway.refundTransaction(transactionId, amount);
    }
}