package com.demo.spring.dempspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// import com.example.ridesharing.exception.RideNotFoundException;

import com.demo.spring.dempspring.model.Ride;
import com.demo.spring.dempspring.repository.RideRepo;

import java.util.List;

@RestController
@RequestMapping("/api/rides")
@CrossOrigin(origins = "http://localhost:3000") // If frontend is running on port 3000
public class RideController {

    @Autowired
    private RideRepo rideRepository;

    // Create a new ride
    @PostMapping
    public ResponseEntity<Ride> createRide(@RequestBody Ride ride) {
        ride.setStatus("In-progress");
        Ride savedRide = rideRepository.save(ride);
        return ResponseEntity.ok(savedRide);
    }

    // Get all rides for a traveler
    @GetMapping("/{travelerId}")
    public ResponseEntity<List<Ride>> getTravelerRides(@PathVariable Integer travelerId) {
        List<Ride> rides = rideRepository.findByTravelerId(travelerId);
        return ResponseEntity.ok(rides);
    }

    // Mark ride as completed
    // @PutMapping("/{rideId}/complete")
    // public ResponseEntity<Ride> completeRide(@PathVariable Integer rideId) {
    //     Ride ride = rideRepository.findById(rideId)
    //         // .orElseThrow(() -> new RideNotFoundException("Ride not found"));
    //     ride.setStatus("Completed");
    //     rideRepository.save(ride);
    //     return ResponseEntity.ok(ride);
    // }
}
