public class PaymentProcessorTest {
    public static void main(String[] args) {
        // Create payment gateways
        PayPalGateway payPal = new PayPalGateway();
        StripeGateway stripe = new StripeGateway();
        
        // Create adapters
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPal);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        
        // Process payments using the common interface
        System.out.println("Processing PayPal payment:");
        payPalProcessor.processPayment(100.00);
        payPalProcessor.verifyPayment("PAYPAL123");
        payPalProcessor.refundPayment("PAYPAL123", 50.00);
        
        System.out.println("\nProcessing Stripe payment:");
        stripeProcessor.processPayment(200.00);
        stripeProcessor.verifyPayment("STRIPE456");
        stripeProcessor.refundPayment("STRIPE456", 100.00);
        
        // Example of using adapters polymorphically
        System.out.println("\nProcessing payments through array:");
        PaymentProcessor[] processors = {payPalProcessor, stripeProcessor};
        
        for (PaymentProcessor processor : processors) {
            processor.processPayment(50.00);
            processor.verifyPayment("TXN" + System.currentTimeMillis());
        }
    }
}