package com.demo.spring.dempspring.service;

import com.demo.spring.dempspring.model.Ride;
import com.demo.spring.dempspring.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {

    @Autowired
    private RideRepository rideRepository;

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    // public List<Ride> getRideAuditTrail() {
        // Logic for fetching the audit trail of rides
        // return rideRepository.findAuditTrail();
        // return null;
    // }
}
