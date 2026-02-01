package oopspractice.composition;

import java.util.ArrayList;
import java.util.List;

public class House {

    private List<Room> rooms;

   void addRoom(Room room) {
        rooms = new ArrayList<>();
       rooms.add(room);
   }

    void showRoom(){
        for (Room room : rooms){
            System.out.println(room.getName());
        }
    }
}