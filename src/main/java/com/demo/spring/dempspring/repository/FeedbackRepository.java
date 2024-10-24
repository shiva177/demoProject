package com.demo.spring.dempspring.repository;

import com.demo.spring.dempspring.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByTravelerId(Long travelerId); // Find feedback by traveler ID
}
