package com.brokemon.services;

import com.brokemon.models.Pokemon;
import com.brokemon.repositories.PokemonRepository;
import java.util.List;
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

  public List<Pokemon> getAllPokemon() {
    return (List<Pokemon>) pokemonRepository.findAll();
  }

  public Pokemon getPokemonById(Long id) {
    return pokemonRepository.findById(id).orElse(new Pokemon("Pikachu", 1, 123, 0));
  }

  public void deleteById(Long id) {
    pokemonRepository.deleteById(id);
  }
}
