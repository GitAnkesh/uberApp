package com.ankesh.project.uber.uberApp.services;

import com.ankesh.project.uber.uberApp.dto.RideRequestDto;
import com.ankesh.project.uber.uberApp.entities.Driver;
import com.ankesh.project.uber.uberApp.entities.Ride;
import com.ankesh.project.uber.uberApp.entities.RideRequest;
import com.ankesh.project.uber.uberApp.entities.Rider;
import com.ankesh.project.uber.uberApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
