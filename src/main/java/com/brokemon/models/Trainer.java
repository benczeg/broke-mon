package com.brokemon.models;

public class Trainer {
    public String name; //null
    public int age; //0 primitiv nem tud null lenni
    public Integer iq; //null
    public int catchSkill;

    public Trainer(String name, int age, int iq, int catchSkill) {
        this.name = name;
        this.age = age;
        this.iq = iq;
        this.catchSkill = catchSkill;
    }


    //public void catchSkillUp(int catchPokemon) {
    //    catchSkill++;
    //}

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", catchSkill=" + catchSkill +
                '}';
    }
}
