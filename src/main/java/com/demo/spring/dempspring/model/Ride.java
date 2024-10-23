package com.demo.spring.dempspring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tripId;
    private String driverName;
    private String driverPhone;
    private String cabNumber;
    private String status; // In-progress, Completed
    private Long travelerId;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTravelerId() {
        return travelerId;
    }

    public void setTravelerId(Long travelerId) {
        this.travelerId = travelerId;
    }
}
