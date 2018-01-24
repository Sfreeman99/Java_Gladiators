package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GladiatorTest {
    @Test
    void makeAGladiator() {
        Gladiator playerOne = new Gladiator("Shedlia Freeman");
        assertEquals("Shedlia Freeman", playerOne.name);
    }
    @Test
    void makeTwoGladiators() {
        Gladiator playerOne;
        Gladiator playerTwo;
        playerOne = new Gladiator("Bob");
        playerTwo = new Gladiator("Billy");
        assertEquals("Bob", playerOne.name);
        assertEquals("Billy", playerTwo.name);
    }
    @Test
    void TestGladiatorCanAttackOtherGladiator() {
        Gladiator playerOne;
        Gladiator playerTwo;
        playerOne = new Gladiator("Billy");
        playerTwo = new Gladiator("Tom");
        playerOne.attack(playerTwo);
        assertTrue(playerTwo.health < 100);
    }

}