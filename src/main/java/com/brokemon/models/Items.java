package com.brokemon.models;

public class Items {
    public int slots; //0 primitiv nem tud null lenni


    public Items(int slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Items{" +
                "slots='" + slots + '\'' +
                '}';
    }
}
