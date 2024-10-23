package uk.co.stardewcalculator;

import java.util.Scanner;

public class PlayerPrompt {
    private final Scanner sc;

    public PlayerPrompt(Scanner sc) {
        this.sc = sc;
    }

    public int setBalance() {
        int balance;
        try {
            System.out.println("What is your current balance? ");
            balance = Integer.parseInt(sc.nextLine()); //if the string doesn't contain a parseable integer, a NumberFormatException is thrown
        }
        catch(NumberFormatException nfe) {
            System.err.println("Invalid input - try again.");
            System.out.println("What is your current balance? ");
            balance = Integer.parseInt(sc.nextLine());
        }
        return balance;
    }

    public double setFarmingLevel() {
        int farmingLevel;
        try {
            System.out.println("What is your farming level? ");
            farmingLevel = Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException nfe) {
            System.err.println("Invalid input - try again.");
            System.out.println("What is your farming level?");
            farmingLevel = Integer.parseInt(sc.nextLine());
        }
        return farmingLevel;
    }

    public boolean setTillerChoice(double farmingLevel) {
        if (farmingLevel >= 5) {
            System.out.println("Have you chosen the tiller profession? (Y/N) ");
        }
        return sc.nextLine().equalsIgnoreCase("y");
    }

    public boolean setAgriculturalistChoice(double farmingLevel) {
        if (farmingLevel == 10) {
        System.out.println("Have you chosen the agriculturalist profession? (Y/N) ");
        }
        return sc.nextLine().equalsIgnoreCase("y");
    }


}
