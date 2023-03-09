package com.brokemon.services;

import com.brokemon.models.Pokemon;
import com.brokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//üzleti logika = service
@Service
public class PokemonService {

  private PokemonRepository pokemonRepository;

  @Autowired
  public PokemonService(PokemonRepository pokemonRepository) {
    this.pokemonRepository = pokemonRepository;
  }

  public Pokemon createNewPokemon(String name, int age, int iq) {
    return pokemonRepository.save(new Pokemon(name, age, iq, 0));
  }

}
