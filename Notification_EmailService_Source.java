public class Notification_EmailService_Source {
        public static void main(String[] args) {
            EmailService emailService = new EmailService("Hello", "ishwar@gmail.com");
            System.out.println(emailService.sendNotification());
        }
}
