package com.demo.spring.dempspring.service;

import com.demo.spring.dempspring.model.Admin;
import com.demo.spring.dempspring.model.Feedback;
import com.demo.spring.dempspring.model.Ride;
import com.demo.spring.dempspring.repository.AdminRepository;
import com.demo.spring.dempspring.repository.FeedbackRepository;
import com.demo.spring.dempspring.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private RideRepository rideRepository;

    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }
}
