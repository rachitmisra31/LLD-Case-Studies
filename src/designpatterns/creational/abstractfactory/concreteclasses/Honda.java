package designpatterns.creational.abstractfactory.concreteclasses;

import designpatterns.creational.abstractfactory.uglycode.Vehicle;

public class Honda implements Vehicle {
    @Override
    public void start() {
        System.out.println("The process of honda creation started");
    }

    @Override
    public void stop() {
        System.out.println("Honda car is ready");
    }
}
