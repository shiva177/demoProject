package com.demo.spring.dempspring.repository;
import com.demo.spring.dempspring.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {

    
}
