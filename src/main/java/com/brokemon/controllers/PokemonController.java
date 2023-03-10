package com.brokemon.controllers;

import com.brokemon.models.Pokemon;
import com.brokemon.services.PokemonService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

  // ne legyen list, csak simán /pokemon -> adja vissza az összes pokemont
  // /pokemon/1 csak egy konkrét pokemont írunk ki ezen lehessen dolgokat változtatni (gombok + UpdateMapping)
  // legyen a fő oldalon működő átirányítás a formra, listára
  // lehessen törölni pokemont (gomb + @DeleteMapping) írja ki, hogy xy pokemon elküldve a profnak
  // ha időd engedi Bag model, Trainer model (regisztrációs oldal) + endpointok

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
    model.addAttribute("pokemons", new ArrayList<Pokemon>().add(pokemonService.getPokemonById(id)));
    return "list"; //érdemes lesz lecserélni másik template-re
  }

  // ide kell varázsolni, hogy csak egy adott pokemon adatait adja vissza (másik html?), ne a list.html-t
  // vagy a list.html-re kell megoldani, hogy a /1-nél az adott adatok kerüljenek fel

  @GetMapping("/pokemon/form")
  public String addPokemonForm() {
    return "form";
  }

  @PostMapping("pokemon/form")
  public String addNewPokemon(@RequestParam(name = "pokename") String name,
                              @RequestParam(name = "pokeage") int age,
                              @RequestParam(name = "pokeiq") int iq,
                              @ModelAttribute Pokemon pokemon,
                              Model model) {

    Pokemon newPokemon = pokemonService.createNewPokemon(name, age, iq);
    model.addAttribute(newPokemon);
    return "list";
  }
}

//@DeleteMapping("pokemon/list")
//?
//@ResponseBody fog kelleni talán?


// @GetMapping("pokemon/add")
// public String addNewPokemon(@RequestParam(name = "pokename") String name,
//                             @RequestParam(name = "pokeage") int age,
//                             @RequestParam(name = "pokeiq") int iq) {
//   Pokemon pokemon = new Pokemon(name, age, iq, 0);
//   System.out.println(pokemon);
//   return "form";
// }

