package com.carbooking.model;

public class Cab {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public Cab(String id, Driver driver, String type) {
        this.id = id;
        this.driver = driver;
        this.type = type;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String id;
    private Driver driver;
    private String type;

}
