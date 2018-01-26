package com.company;



public class Gladiator {

    public String name;
    public double attackLow;
    public double attackHigh;
    public int health;
    public int rage;

    public Gladiator(String playerName) {
        /*
        this is the gladiator constructor which is called when you want a new gladiator object
        this object has a name, attackLow, attackHigh, health, and rage
        */
        name = playerName;
        attackHigh = 25;
        attackLow = 10;
        health = 100;
        rage = 0;
    }
    public int attack(Gladiator defender){
        double attack = Math.random() * attackHigh + attackLow;
        defender.health -= attack;
        return defender.health;
    }
    public double heal() {
        this.health += 15;
        if (this.health > 100)
            return health = 100;
        else
            return health;
    }
}
