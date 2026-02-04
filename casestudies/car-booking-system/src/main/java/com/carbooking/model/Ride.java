package com.carbooking.model;

import com.carbooking.enums.RideStatus;

public class Ride {
    private String id;
    private User user;
    private Driver driver;
    private RideStatus status;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Driver getDriver() {
        return driver;
    }

    public Ride(String id, User user, Driver driver) {
        this.id = id;
        this.user = user;
        this.driver = driver;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void startRide(){
        status = RideStatus.ONGOING;
        driver.setAvailable(false);
        System.out.println("Ride started for user " +user.getName());
    }
    public void endRide(){
        status = RideStatus.COMPLETED;
        driver.setAvailable(true);
        System.out.println("Ride ended for user " +user.getName());
    }

    public void cancelRide(){
        status = RideStatus.CANCELLED;
        driver.setAvailable(true);
        System.out.println("Ride cancelled for user " +user.getName());
    }
}
