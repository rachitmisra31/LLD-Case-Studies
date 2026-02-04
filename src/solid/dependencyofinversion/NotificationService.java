package solid.dependencyofinversion;

public class NotificationService {

    private final NotificationChannel channel;
    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }
    void sendNotification(String message) {
        channel.sendNotification(message);
    }
}
