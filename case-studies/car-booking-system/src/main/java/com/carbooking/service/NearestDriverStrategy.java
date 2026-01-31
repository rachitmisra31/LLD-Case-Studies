package com.carbooking.service;

import com.carbooking.model.Driver;
import com.carbooking.model.Location;

import java.util.List;

public class NearestDriverStrategy implements MatchingStrategy{
    @Override
    public Driver matchDriver(Location userLocation, List<Driver> drivers) {
        Driver nearestDriver = null;
        Double minDistance = Double.MAX_VALUE;
        for(Driver driver : drivers){
            Double distance = calculateDistance(userLocation, driver.getLocation());
            if(distance < minDistance){
                minDistance = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }

    private Double calculateDistance(Location loc1, Location loc2) {

        double latDiff = loc1.getLatitude() - loc2.getLatitude();
        double lngDiff = loc1.getLongitude() - loc2.getLongitude();

        return Math.sqrt(latDiff * latDiff + lngDiff * lngDiff);
    }

}