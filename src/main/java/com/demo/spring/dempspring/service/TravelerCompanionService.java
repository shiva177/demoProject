package com.demo.spring.dempspring.service;

import com.demo.spring.dempspring.model.TravelerCompanion;
import com.demo.spring.dempspring.repository.TravelerCompanionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelerCompanionService {

    @Autowired
    private TravelerCompanionRepository travelerCompanionRepository;

    public List<TravelerCompanion> getAllCompanions() {
        return travelerCompanionRepository.findAll();
    }

    public TravelerCompanion getCompanionById(Long id) {
        return travelerCompanionRepository.findById(id).orElse(null);
    }

    public TravelerCompanion createCompanion(TravelerCompanion companion) {
        return travelerCompanionRepository.save(companion);
    }

    public void deleteCompanion(Long id) {
        travelerCompanionRepository.deleteById(id);
    }
}
