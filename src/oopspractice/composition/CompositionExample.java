package oopspractice.composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionExample {

    public static void main(String[] args) {

        House house = new House();
        house.addRoom(new Room("LivingRoom"));

        house.showRoom();
    }
}
