package designpatterns.creational.abstractfactory.goodcode;

public class Mercedes implements Vehicle {
    @Override
    public void start() {
        System.out.println("Mercedes is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes is stopping...");
    }
}
