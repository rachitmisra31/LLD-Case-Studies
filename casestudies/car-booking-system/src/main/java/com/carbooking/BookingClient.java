package com.carbooking;

import com.carbooking.model.Driver;
import com.carbooking.model.Location;
import com.carbooking.model.Ride;
import com.carbooking.model.User;
import com.carbooking.service.BookingService;

import java.util.ArrayList;
import java.util.List;

public class BookingClient {

    public static void main(String[] args) {
        List<Driver>  drivers = new ArrayList<>();
        Driver driver1 = new Driver("2312", "Rakesh", new Location(12.0, 13.0));
        Driver driver2= new Driver("3212", "Ramesh", new Location(14.0, 15.0));
        Driver driver3 = new Driver("2312", "Rajesh", new Location(16.0, 17.0));
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);

        User user = new User("2121", "Atharv", new Location(11.0,12.0));

        BookingService bookingService = BookingService.getInstance();

        Ride ride = bookingService.bookRide(user, new Location(10.0,11.0), drivers);
        if(ride == null){
            System.out.println("No driver available for user "+user.getName());
        }
        else
        {
            System.out.println("Ride Booked Successfuly for "+user.getName()+ " with driver "+ride.getDriver().getName() );
        }
        if(ride != null){
            bookingService.cancelRide(ride);
            System.out.println("Booking status after canceling the ride"+ ride.getStatus());
        }
        if(ride != null){
            bookingService.endRide(ride);
            System.out.println("Booking status after ending the ride"+ ride.getStatus());
        }
    }
}
