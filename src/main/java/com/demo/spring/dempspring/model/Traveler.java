package com.demo.spring.dempspring.model;

import jakarta.persistence.*;


@Entity
public class Traveler{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Traveler Information
    private String name;
    private String phoneNumber;

    // Ride Information
    private String driverName;
    private String cabNumber;
    private String tripId;
    private boolean completed;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getCabNumber() {
        return cabNumber;
    }
    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }
    public String getTripId() {
        return tripId;
    }
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    // Getters and Setters
    
}