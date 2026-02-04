package designpatterns.creational.abstractfactory.concreteclasses;

import designpatterns.creational.abstractfactory.uglycode.Vehicle;

public class Mercedes implements Vehicle {

    @Override
    public void start() {
        System.out.println("The process of Mercedes creation started");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes car is ready");
    }
}
