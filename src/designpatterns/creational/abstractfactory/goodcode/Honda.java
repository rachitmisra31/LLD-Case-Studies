package designpatterns.creational.abstractfactory.goodcode;

public class Honda implements Vehicle {


    @Override
    public void start() {
        System.out.println("Honda is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Honda is stopping...");
    }
}
