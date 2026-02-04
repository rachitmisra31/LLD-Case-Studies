package com.carbooking.service;

import com.carbooking.model.Driver;
import com.carbooking.model.Location;

import java.util.List;

public class MatchingService {

    private static MatchingService instance;
    private MatchingStrategy matchingStrategy;
    public MatchingService(MatchingStrategy matchingStrategy){
        this.matchingStrategy = matchingStrategy;
    }
    public void setStrategy(MatchingStrategy matchingStrategy){
        this.matchingStrategy = matchingStrategy;
    }
    public Driver findDriver(Location userLocation, List<Driver>drivers){
        return matchingStrategy.matchDriver(userLocation, drivers);
    }

    public static MatchingService getInstance(){
        if(instance == null){
            return new MatchingService(new NearestDriverStrategy());
        }
        return instance;
    }
}
