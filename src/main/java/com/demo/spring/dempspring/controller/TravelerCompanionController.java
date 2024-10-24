package com.demo.spring.dempspring.controller;

import com.demo.spring.dempspring.model.TravelerCompanion;
import com.demo.spring.dempspring.service.TravelerCompanionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companion")
public class TravelerCompanionController {

    @Autowired
    private TravelerCompanionService companionService;

    // Get all companions
    @GetMapping("/getAll")
    public List<TravelerCompanion> getAllCompanions() {
        return companionService.getAllCompanions();
    }

    // Get a companion by ID
    @GetMapping("/{id}")
    public ResponseEntity<TravelerCompanion> getCompanionById(@PathVariable Long id) {
        TravelerCompanion companion = companionService.getCompanionById(id);
        return companion != null ? ResponseEntity.ok(companion) : ResponseEntity.notFound().build();
    }

    // Create a new companion
    @PostMapping("/createcomp")
    public TravelerCompanion createCompanion(@RequestBody TravelerCompanion companion) {
        return companionService.createCompanion(companion);
    }

    // Delete a companion
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanion(@PathVariable Long id) {
        companionService.deleteCompanion(id);
        return ResponseEntity.ok("Companion deleted successfully.");
    }
}
