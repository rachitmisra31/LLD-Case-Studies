package designpatterns.creational.abstractfactory.concreteclasses;

import designpatterns.creational.abstractfactory.uglycode.Vehicle;

public class Toyota implements Vehicle {
    @Override
    public void start() {
        System.out.println("The process of Toyota creation started");
    }

    @Override
    public void stop() {
        System.out.println("Toypta car is ready");
    }
}