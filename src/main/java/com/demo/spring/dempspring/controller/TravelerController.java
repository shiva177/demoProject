package com.demo.spring.dempspring.controller;

import com.demo.spring.dempspring.model.Traveler;
import com.demo.spring.dempspring.service.TravelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traveler")
public class TravelerController {

    @Autowired
    private TravelerService travelerService;

    // Get all travelers
    @GetMapping("/getAll")
    public List<Traveler> getAllTravelers() {
        return travelerService.getAllTravelers();
    }

    // Get a traveler by ID
    @GetMapping("/{id}")
    public ResponseEntity<Traveler> getTravelerById(@PathVariable Long id) {
        Traveler traveler = travelerService.getTravelerById(id);
        return traveler != null ? ResponseEntity.ok(traveler) : ResponseEntity.notFound().build();
    }

    // Create a new traveler
    @PostMapping("/createtrav")
    public Traveler createTraveler(@RequestBody Traveler traveler) {
        return travelerService.createTraveler(traveler);
    }

    // Update a traveler
    @PutMapping("/{id}")
    public ResponseEntity<Traveler> updateTraveler(@PathVariable Long id, @RequestBody Traveler updatedTraveler) {
        Traveler traveler = travelerService.updateTraveler(id, updatedTraveler);
        return traveler != null ? ResponseEntity.ok(traveler) : ResponseEntity.notFound().build();
    }

    // Complete a trip for a traveler
    @PostMapping("/complete-trip/{id}")
    public ResponseEntity<String> completeTrip(@PathVariable Long id) {
        travelerService.completeTrip(id);
        return ResponseEntity.ok("Trip completed successfully.");
    }

    // Delete a traveler
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTraveler(@PathVariable Long id) {
        travelerService.deleteTraveler(id);
        return ResponseEntity.ok("Traveler deleted successfully.");
    }
}

