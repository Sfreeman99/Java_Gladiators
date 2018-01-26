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
    @Test
    void TestGladiatorCanAttackAfterBeingAttacked() {
        Gladiator playerOne = new Gladiator("Bill");
        Gladiator playerTwo = new Gladiator("Bob");
        playerOne.attack(playerTwo);
        assertTrue(playerTwo.health < 100);
        assertEquals(100, playerOne.health);
        playerTwo.attack(playerOne);
        assert playerOne.health < 100 ;
    }
    @Test
    void TestGladiatorCanHeal() {
        //Bill got to fighting with Jo
        Gladiator Bill = new Gladiator("Bill");
        Gladiator Jo = new Gladiator("Jo");
        // Bill hit Jo in the mouth
        Bill.attack(Jo);
        double JoOriginalHealth = Jo.health;
        //Jo stood back and put a bandage on the wound he got
        Jo.heal();
        assert Jo.health > JoOriginalHealth;

    }
    @Test
    void TestGladiatorIsDead() {
        // Bill got extremely mad at Paul
        Gladiator Bill = new Gladiator("Bill");
        Gladiator Paul = new Gladiator("Paul");
        // Instead of fighting fair he hit Paul with a bat
        Bill.attack(Paul);
        // He accidentally killed Paul
        Paul.health = 0;
        assertTrue(Paul.isDead());
    }

}