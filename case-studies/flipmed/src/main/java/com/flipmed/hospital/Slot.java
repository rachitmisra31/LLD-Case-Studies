package com.flipmed.hospital;

import java.time.LocalTime;

public class Slot {

    private final LocalTime startTime;
    private final LocalTime endTime;

    public Slot(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
