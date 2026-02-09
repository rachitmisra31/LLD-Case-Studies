package com.carbooking.service;

import com.carbooking.model.Driver;
import com.carbooking.model.Location;
import com.carbooking.model.Ride;
import com.carbooking.model.User;

import java.util.List;
import java.util.UUID;

public class BookingService {

    private static BookingService instance;

    private BookingService() {
    }

    public static BookingService getInstance() {
        if (instance == null) {
            instance = new BookingService();

        }
        return instance;
    }

    public Ride bookRide(User user, Location destination, List<Driver> availableDrivers) {
        Driver driver = MatchingService.getInstance().findDriver(user.getLocation(), availableDrivers);
        if (driver == null) {
            System.out.println("No driver available for user" + user.getName());
            return null;
        }
        String rideId = UUID.randomUUID().toString();
        Ride ride = new Ride(rideId, user, driver);
        System.out.println("Ride booked successfully for user " + user.getName() + " with driver " + driver.getName());
        driver.setAvailable(false);

        return ride;
    }

    public void cancelRide(Ride ride) {
        if (ride != null) {
            ride.cancelRide();
        }
    }

    public void endRide(Ride ride) {
        if (ride != null) {
            ride.endRide();
        }
    }
}
