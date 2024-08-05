package com.ankesh.project.uber.uberApp.services;

import com.ankesh.project.uber.uberApp.dto.DriverDto;
import com.ankesh.project.uber.uberApp.dto.RideDto;
import com.ankesh.project.uber.uberApp.dto.RiderDto;
import com.ankesh.project.uber.uberApp.entities.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideRequestId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId, String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Driver getCurrentDriver();

    Driver updateDriverAvailability(Driver driver, boolean available);
}