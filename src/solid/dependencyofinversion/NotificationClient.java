package solid.dependencyofinversion;

public class NotificationClient {
    public static void main(String[] args) {
       NotificationService notificationService = new NotificationService(new EmailNotification());
       notificationService.sendNotification("Hello World");
    }
}
