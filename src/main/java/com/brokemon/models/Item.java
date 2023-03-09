package com.brokemon.models;

public class Item {
    public int slots; //0 primitiv nem tud null lenni


    public Item(int slots) {
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Items{" +
                "slots='" + slots + '\'' +
                '}';
    }
}
