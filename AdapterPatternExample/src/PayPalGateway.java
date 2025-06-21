public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
    
    public boolean checkPaymentStatus(String transactionId) {
        System.out.println("Checking PayPal payment status for transaction: " + transactionId);
        return true;
    }
    
    public void issueRefund(String transactionId, double amount) {
        System.out.println("Issuing PayPal refund of $" + amount + " for transaction: " + transactionId);
    }
}