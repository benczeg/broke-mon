package com.brokemon.services;

import com.brokemon.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private TrainerRepository trainerRepository;
    @Autowired
    public TrainerService (TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

}
