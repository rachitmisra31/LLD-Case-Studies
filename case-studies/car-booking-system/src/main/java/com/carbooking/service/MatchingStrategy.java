package com.carbooking.service;

import com.carbooking.model.Driver;
import com.carbooking.model.Location;

import java.util.List;

public interface MatchingStrategy {

    Driver matchDriver(Location userLocation, List<Driver> drivers);
}
