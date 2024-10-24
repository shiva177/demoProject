package com.demo.spring.dempspring.service;

import com.demo.spring.dempspring.model.Feedback;
import com.demo.spring.dempspring.repository.FeedbackRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepo;

    public FeedbackService(FeedbackRepository feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }

    public List<Feedback> getAllFeedback() {
        return feedbackRepo.findAll();  // Fetches all feedback
    }
}
