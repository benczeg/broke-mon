package com.brokemon.repositories;

import com.brokemon.models.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends CrudRepository <Trainer, Long> {
}
