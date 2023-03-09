package com.brokemon.repositories;

//CRUD műveletek = Create, Read, Update, Delete
import com.brokemon.models.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

}