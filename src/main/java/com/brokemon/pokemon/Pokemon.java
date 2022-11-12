package com.brokemon.pokemon;

public class Pokemon {
  //fields -> sql columns
  public String name; //null
  public int age; //0 primitiv nem tud null lenni
  public Integer iq; //null
  public int hunger; //0
  public int height;
  public int weight;
  public int health;
  public int attack;
  public int defense;


  //constructors
  public Pokemon(String name, int age, int iq, int hunger){
    this.name = name;
    this.age = age;
    this.iq = iq;
    this.hunger = hunger;
    this.height = height;
    this.weight = weight;
    this.health = health;
    this.attack = attack;
    this.defense = defense;
  }

  //methods
  public void eat(int foodAmount) { hunger--; weight++; }
  public void takesDmg (int incDmgAmount) { health--; } //beérkező sebzéstől csökken az élete


}
