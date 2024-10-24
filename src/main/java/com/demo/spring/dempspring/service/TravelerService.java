// package com.demo.spring.dempspring.service;

// import com.demo.spring.dempspring.model.Traveler;
// import com.demo.spring.dempspring.repository.TravelerRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class TravelerService {

//     @Autowired
//     private TravelerRepository travelerRepository;

//     // Create or update a traveler
//     public Traveler saveTraveler(Traveler traveler) {
//         return travelerRepository.save(traveler);
//     }

//     // Get all travelers
//     public List<Traveler> getAllTravelers() {
//         return travelerRepository.findAll();
//     }

//     // Get a traveler by ID
//     public Optional<Traveler> getTravelerById(Long id) {
//         return travelerRepository.findById(id);
//     }

//     // Delete a traveler by ID
//     public void deleteTraveler(Long id) {
//         travelerRepository.deleteById(id);
//     }
// }

package com.demo.spring.dempspring.service;

import com.demo.spring.dempspring.model.Traveler;
import com.demo.spring.dempspring.repository.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelerService {

    @Autowired
    private TravelerRepository travelerRepository;

    public List<Traveler> getAllTravelers() {
        return travelerRepository.findAll();
    }

    public Traveler getTravelerById(Long id) {
        return travelerRepository.findById(id).orElse(null);
    }

    public Traveler createTraveler(Traveler traveler) {
        return travelerRepository.save(traveler);
    }

    public Traveler updateTraveler(Long id, Traveler updatedTraveler) {
        Traveler traveler = travelerRepository.findById(id).orElse(null);

        if (traveler != null) {
            traveler.setName(updatedTraveler.getName());
            traveler.setPhoneNumber(updatedTraveler.getPhoneNumber());
            traveler.setDriverName(updatedTraveler.getDriverName());
            traveler.setCabNumber(updatedTraveler.getCabNumber());
            traveler.setTripId(updatedTraveler.getTripId());
            traveler.setCompleted(updatedTraveler.isCompleted());
            return travelerRepository.save(traveler);
        }

        return null;
    }

    public void completeTrip(Long id) {
        Traveler traveler = travelerRepository.findById(id).orElse(null);

        if (traveler != null) {
            traveler.setCompleted(true);
            travelerRepository.save(traveler);
        }
    }

    public void deleteTraveler(Long id) {
        travelerRepository.deleteById(id);
    }
}

