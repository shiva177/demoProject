package com.demo.spring.dempspring.repository;
import com.demo.spring.dempspring.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RideRepo extends JpaRepository<Ride, Integer> {

     // Custom query to find rides by travelerId
     List<Ride> findByTravelerId(Integer travelerId);
}
