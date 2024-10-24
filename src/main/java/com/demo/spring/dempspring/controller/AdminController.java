package com.demo.spring.dempspring.controller;

import com.demo.spring.dempspring.model.Admin;
import com.demo.spring.dempspring.model.Feedback;
import com.demo.spring.dempspring.model.Ride;
import com.demo.spring.dempspring.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Get all admins
    @GetMapping("/admins")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    // Get all rides
    @GetMapping("/rides")
    public List<Ride> getAllRides() {
        return adminService.getAllRides();
    }

    // Get all feedbacks
    @GetMapping("/feedbacks")
    public List<Feedback> getAllFeedbacks() {
        return adminService.getAllFeedbacks();
    }

    // Create a new admin
    @PostMapping("/createAdmin")
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }

    // Delete an admin
    @DeleteMapping("/deleteAdmin/{id}")
    public ResponseEntity<String> deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdmin(id);
        return ResponseEntity.ok("Admin deleted successfully.");
    }
}


