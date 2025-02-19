package com.example.demo.controller;

import com.example.demo.model.Job;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public String viewHomePage(Model model) {
        List<Job> jobList = jobService.getAllJobs();
        model.addAttribute("jobs", jobList);
        return "index";  // Renders index.html in templates folder
    }
}
