package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

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

    public int setSeedCount() {
        int seedCount;
        try {
            System.out.println("How many tiles do you have to fill? ");
            seedCount = Integer.parseInt(sc.nextLine());
        }
        catch (NumberFormatException nfe){
            System.err.println("Invalid input - try again.");
            System.out.println("How many tiles do you have to fill? ");
            seedCount = Integer.parseInt(sc.nextLine());
        }
        return seedCount;
    }

    public int setFertilizerLevel() {
        int fertilizerLevel;
        try {
            System.out.println("Which fertilizer do you use? (0 - 3) ");
            System.out.println("0 - normal soil");
            System.out.println("1 - basic fertilizer");
            System.out.println("2 - quality fertilizer");
            System.out.println("3 - deluxe fertilizer");
            fertilizerLevel = Integer.parseInt(sc.nextLine());
            if (fertilizerLevel < 0 || fertilizerLevel > 3) {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException nfe) {
            System.err.println("Invalid input - try again.");
            System.out.println("Which fertilizer do you use? (0 - 3) ");
            System.out.println("0 - normal soil");
            System.out.println("1 - basic fertilizer");
            System.out.println("2 - quality fertilizer");
            System.out.println("3 - deluxe fertilizer");
            fertilizerLevel = Integer.parseInt(sc.nextLine());
        }
        return fertilizerLevel;
    }

    public Crop setCropChoice() {
        Crop crop;
        try {
            System.out.println("Which crop? ");
            String cropChoice = sc.nextLine().toLowerCase();
            crop = CropFactory.assignCrop(cropChoice);
        }
        catch (IllegalArgumentException iae) {
            System.err.println("Invalid input - try again.");
            System.out.println("Which crop? ");
            String cropChoice = sc.nextLine().toLowerCase();
            crop = CropFactory.assignCrop(cropChoice);
        }
        return crop;
    }

    public String retryCropChoice() {
        System.out.println("Try another crop? (Y/N) ");
        return sc.nextLine();
    }
}
