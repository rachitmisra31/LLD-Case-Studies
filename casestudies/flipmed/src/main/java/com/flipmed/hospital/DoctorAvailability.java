package com.flipmed.hospital;

import java.time.LocalTime;
import java.util.*;

public class DoctorAvailability {

    private final Map<String, Set<Slot>> doctorAvailabilityMap = new HashMap<>();

    public String markDoctorAvailable(String doctorName, List<Slot> slots){

        for(Slot slot : slots){
            if(!validSlot(slot))
                return "Slot can only be of 1 hour! ";
        }
        doctorAvailabilityMap.putIfAbsent(doctorName, new HashSet<>());
        doctorAvailabilityMap.get(doctorName).addAll(slots);
        return "Done Doctor!! "+doctorName;
    }

    private boolean validSlot(Slot slot) {

        LocalTime startTime = slot.getStartTime();
        LocalTime endTime = slot.getEndTime();
        if(startTime.isAfter(endTime)){
            return false;
        }
        int hourDiff = endTime.getHour()- startTime.getHour();
        int minDiff = endTime.getMinute() - startTime.getMinute();

        if(hourDiff == 1 && minDiff == 0)
            return true;

        return false;
    }

    public void removeSlots(Slot slot, String doctorName){
        Set<Slot> slots  = doctorAvailabilityMap.get(doctorName);
        if(Objects.nonNull(slots)){
            slots.remove(slot);
        }
    }
}
