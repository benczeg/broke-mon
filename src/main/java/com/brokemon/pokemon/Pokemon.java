package com.brokemon.pokemon;

public class Pokemon {
  //fields -> sql columns
  public String name; //null
  public int age; //0 primitiv nem tud null lenni
  public Integer iq; //null
  public int hunger; //0

  //constructors
  public Pokemon(String name, int age, int iq, int hunger){
    this.name = name;
    this.age = age;
    this.iq = iq;
    this.hunger = hunger;
  }

  //methods
  public void eat(int foodAmount){
    hunger--;
  }

}
