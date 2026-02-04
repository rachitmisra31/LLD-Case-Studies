package designpatterns.creational.abstractfactory.goodcode;

public class Toyota implements Vehicle {
    @Override
    public void start() {
        System.out.println("Toyota is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Toyota is stopping...");
    }
}
