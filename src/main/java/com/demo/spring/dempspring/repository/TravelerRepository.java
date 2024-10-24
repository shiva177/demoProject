package com.demo.spring.dempspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.spring.dempspring.model.Traveler;

public interface TravelerRepository extends JpaRepository<Traveler, Long> {
    // No need for additional methods unless you want custom queries
}
