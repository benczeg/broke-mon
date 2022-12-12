package com.brokemon.controllers;

import com.brokemon.models.Trainer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrainerController {
    @GetMapping("profile")
    public String listProfile() {
        return "profile";
    }
}
