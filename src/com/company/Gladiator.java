package com.company;

public class Gladiator {

    public String name;
    public int attackLow;
    public int attackHigh;
    public int health;
    public int rage;

    public Gladiator(String playerName) {
        /*
        this is the gladiator constructor which is called when you want a new gladiator object
        this object has a name, attackLow, attackHigh, health, and rage
        */
        name = playerName;
        attackLow = 0;
        attackHigh = 10;
        health = 100;
        rage = 0;
    }
}
