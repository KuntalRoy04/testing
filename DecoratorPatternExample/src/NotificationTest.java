public class NotificationTest {
    public static void main(String[] args) {
        // Simple email notification
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Server is up and running");
        
        System.out.println("\n---\n");
        
        // Email + SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Database connection lost");
        
        System.out.println("\n---\n");
        
        // Email + SMS + Slack notification
        Notifier fullNotifier = new SlackNotifierDecorator(
                                new SMSNotifierDecorator(
                                new EmailNotifier()));
        fullNotifier.send("System update completed");
        
        System.out.println("\n---\n");
        
        // Just SMS + Slack (no email)
        Notifier smsSlackNotifier = new SlackNotifierDecorator(
                                   new SMSNotifierDecorator(
                                   new EmailNotifier()));
        smsSlackNotifier.send("Maintenance scheduled");
    }
}