package com.brokemon.controllers;

import com.brokemon.models.Pokemon;
import com.brokemon.services.PokemonService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

  private PokemonService pokemonService;

  @Autowired
  public PokemonController(PokemonService pokemonService) {
    this.pokemonService = pokemonService;
  }

  @GetMapping("pokemon")
  //@ResponseBody
  public String listPokemon(Model model) {
    model.addAttribute("pokemons", pokemonService.getAllPokemon());
    return "list";
  }

  @GetMapping("pokemon/{id}")
  public String listUniquePokemon(@PathVariable Long id, Model model) {
    List<Pokemon> pokemons = new ArrayList<Pokemon>();
    pokemons.add(pokemonService.getPokemonById(id));
    model.addAttribute("pokemons", pokemons);
    return "list"; //érdemes lesz lecserélni másik template-re pl. restemplate
  }

  @GetMapping("/pokemon/form")
  public String addPokemonForm() {
    return "form";
  }

  @PostMapping("pokemon/form")
  public String addNewPokemon(@RequestParam(name = "pokename") String name,
                              @RequestParam(name = "pokeage") int age,
                              @RequestParam(name = "pokeiq") int iq,
                              Model model) {
    Pokemon newPokemon = pokemonService.createNewPokemon(name, age, iq);
    model.addAttribute("pokemons", pokemonService.getAllPokemon());
    return "list";
  }

  @GetMapping("pokemon/delete/{id}")
  public String deletePokemon(@PathVariable Long id, Model model) {
    pokemonService.deleteById(id);
    model.addAttribute("pokemons", pokemonService.getAllPokemon());
    return "list";
  }
}


// @GetMapping("pokemon/add")
// public String addNewPokemon(@RequestParam(name = "pokename") String name,
//                             @RequestParam(name = "pokeage") int age,
//                             @RequestParam(name = "pokeiq") int iq) {
//   Pokemon pokemon = new Pokemon(name, age, iq, 0);
//   System.out.println(pokemon);
//   return "form";
// }

