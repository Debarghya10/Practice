class EmailService extends NotificationService {

    private String email;

    EmailService(String message, String email) {
        super(message);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String sendNotification() {
        return "Email sent to: " + this.getEmail() + " with message: " + super.getMessage();
    }
}
/*
 * TODO 2: Provide EmailService class which extends NotificationService class. Provide
 * following attributes and methods.
 *
 * Attributes:
 * 		- email: String
 * 		Also provide getters and setters for it.
 *
 * Methods:
 * 		+ sendNotification(): String
 * 		This method is the implementation of the abstract method present in the NotificationService
 * 		class.
 * 		This method should return the following output:
 * 		Email sent to: <email> with message: <message>
 * 		For example:
 * 		Email sent to: ishwar@gmail.com with message: Hello
 */

