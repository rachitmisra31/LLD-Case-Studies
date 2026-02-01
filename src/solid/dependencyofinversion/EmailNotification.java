package solid.dependencyofinversion;

public class EmailNotification implements NotificationChannel{
    @Override
    public void sendNotification(String message) {
        System.out.println("Message send through email "+message);
    }
}
