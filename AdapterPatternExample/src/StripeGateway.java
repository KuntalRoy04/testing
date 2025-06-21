public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
    
    public boolean verifyTransaction(String transactionId) {
        System.out.println("Verifying Stripe transaction: " + transactionId);
        return true;
    }
    
    public void refundTransaction(String transactionId, double amount) {
        System.out.println("Refunding Stripe transaction " + transactionId + " amount $" + amount);
    }
}