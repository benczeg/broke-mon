package com.brokemon.controllers;

import com.brokemon.models.Pokemon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.DeleteMapping;

@Controller
public class PokemonController {

  // ne legyen list, csak simán /pokemon -> adja vissza az összes pokemont
  // /pokemon/1 csak egy konkrét pokemont írunk ki ezen lehessen dolgokat változtatni (gombok + UpdateMapping)
  // legyen a fő oldalon működő átirányítás a formra, listára
  // lehessen törölni pokemont (gomb + @DeleteMapping) írja ki, hogy xy pokemon elküldve a profnak
  // ha időd engedi Bag model, Trainer model (regisztrációs oldal) + endpointok

  @GetMapping("pokemon")
  public String listPokemon() {
    return "list";
  }

  @GetMapping("pokemon/1")
  public String listUniquePokemon() {
    return "list";
  }

  // ide kell varázsolni, hogy csak egy adott pokemon adatait adja vissza (másik html?), ne a list.html-t
  // vagy a list.html-re kell megoldani, hogy a /1-nél az adott adatok kerüljenek fel
  @GetMapping("pokemon/form")
  public String addPokemonForm() {
    return "form";
  }

  @PostMapping("pokemon/form")
  public String addNewPokemon(@RequestParam(name = "pokename") String name,
                              @RequestParam(name = "pokeage") int age,
                              @RequestParam(name = "pokeiq") int iq) {
    Pokemon pokemon = new Pokemon(name, age, iq, 0);
    System.out.println(pokemon);
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

