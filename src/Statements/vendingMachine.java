package Statements;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scn.nextInt();
        if (cents > 0 && cents < 100) {
            int nickels, dimes, quarters, pennies;
            quarters = cents / 25;
            cents = cents % 25;

            dimes = cents / 10;
            cents = cents % 10;

            nickels = cents / 5;
            cents = cents % 5;


            pennies = cents;

            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies");

        } else {
            System.out.println("Invalid cents amount");


        }
    }
}
