package solid.dependencyofinversion;

public class InstaNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Message send through instagram "+message);
    }
}
