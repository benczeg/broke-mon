package com.brokemon.controllers;

import com.brokemon.models.Trainer;
import com.brokemon.repositories.TrainerRepository;
import com.brokemon.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController (TrainerService trainerService) {
        this.trainerService = trainerService;
    }
    
    @GetMapping("profile")
    public String listProfile() {
        return "profile";
    }

    @GetMapping("register")
    public String register() {
        return "register";
    }

    @PostMapping("register")
    public String createTrainer() {
        return "profile";
    }
}


