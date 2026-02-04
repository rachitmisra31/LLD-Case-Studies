package com.carbooking.model;

public class Driver {

    private String id;
    private String name;
    private Location location;
    private boolean isAvailable;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Driver(String id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.isAvailable = true;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
