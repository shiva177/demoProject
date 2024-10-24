package com.demo.spring.dempspring.repository;

import com.demo.spring.dempspring.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RideRepository extends JpaRepository<Ride, Long> {
    List<Ride> findByTravelerId(Long travelerId); // Find rides by traveler ID
}
