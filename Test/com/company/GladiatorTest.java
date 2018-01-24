package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GladiatorTest {
    @Test
    void makeAGladiator() {
        Gladiator playerOne = new Gladiator("Shedlia Freeman");
        assertEquals("Shedlia Freeman", playerOne.name);
    }

}