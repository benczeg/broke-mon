package com.brokemon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemons")
public class Pokemon {
  //fields -> sql columns
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

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
  public Pokemon() {
  }

  public Pokemon(Long id, String name, int age, Integer iq, int hunger, int height, int weight,
                 int health, int attack, int defense) {
    this.id = id;
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

  public Pokemon(String name, int age, int iq, int hunger) {
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

  //getters & setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Integer getIq() {
    return iq;
  }

  public void setIq(Integer iq) {
    this.iq = iq;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  //methods
  public void eat(int foodAmount) {
    hunger--;
    weight++;
  }

  public void takesDmg(int incDmgAmount) {
    health--;
  } //beérkező sebzéstől csökken az élete

}
