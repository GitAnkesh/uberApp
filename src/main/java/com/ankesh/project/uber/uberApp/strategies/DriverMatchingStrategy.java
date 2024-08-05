package com.ankesh.project.uber.uberApp.strategies;

import com.ankesh.project.uber.uberApp.entities.Driver;
import com.ankesh.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
