package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
	    System.out.print("Gladiator One Name: ");
	    String gladOneName = userInput.next();
	    Gladiator gladiatorOne = new Gladiator(gladOneName);
	    System.out.println("Gladiator Two Name:");
	    String gladTwoName = userInput.next();
	    Gladiator gladiatorTwo = new Gladiator(gladTwoName);
	    while (true){
	        System.out.print(healthbars(gladiatorOne) + " ||| " + healthbars(gladiatorTwo) + "\n");
	        game(gladiatorOne,gladiatorTwo);
	        if (gladiatorTwo.isDead())
	            break;
            System.out.print(healthbars(gladiatorOne) + " ||| " + healthbars(gladiatorTwo) + "\n");
	        game(gladiatorTwo,gladiatorOne);
	        if (gladiatorOne.isDead())
	            break;
        }
        gameOver(gladiatorOne,gladiatorTwo);


    }
    private static void game(Gladiator attacker, Gladiator defender) {
        Scanner gladInput = new Scanner(System.in);
        while (true) {
            System.out.print(attacker.name + ": \nWhat would you like to do?\n[A]ttack\n[H]eal\n: ");
            String attack = gladInput.next().toUpperCase();
            if (attack.equals("A") || attack.equals("ATTACK")) {
                attacker.attack(defender);
                break;
            }
         else if (attack.equals("H") || attack.equals("Heal")) {
            attacker.heal();
            break;
        } else
            System.out.print("That is not a valid choice.. Please choose a correct one\n");
    }

    }
    private static void gameOver(Gladiator playerOne, Gladiator playerTwo){
        if (playerOne.isDead())
            System.out.print("Winner: " + playerTwo.name + "\nLoser: " + playerOne.name);
        else
            System.out.print("Winner: " + playerOne.name + "\nLoser: " + playerTwo.name);

    }
    private static String healthbars(Gladiator player){
        String playerHealth = player.name + "|| Health: " + player.health + "|| Rage:" + player.rage
                + "|| AttackLow: " + player.attackLow + "|| AttackHigh: " + player.attackHigh;
        return playerHealth;
    }
}
