package com.example.demo.service;

import com.example.demo.model.Application;
import com.example.demo.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    // Get all job applications
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    // Submit a new job application
    public Application applyForJob(Application application) {
        return applicationRepository.save(application);
    }
}
