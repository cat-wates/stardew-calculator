package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class PlayerPrompt {
    private final Scanner sc;

    public PlayerPrompt(Scanner sc) {
        this.sc = sc;
    }

    public int setBalance() {
        System.out.println("What is your current balance? ");
        return Integer.parseInt(sc.nextLine()); //balance
    }

    public double setFarmingLevel() {
        System.out.println("What is your farming level? ");
        return Integer.parseInt(sc.nextLine()); //farmingLevel
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
        System.out.println("How many tiles do you have to fill? ");
        return Integer.parseInt(sc.nextLine()); //seedCount
    }

    public void setCropAndCalculateStats(int balance, double farmingLevel, int seedCount, boolean isTiller) {
        boolean cont = true;
        while (cont) {
            System.out.println("Which crop? ");
            String cropType = sc.nextLine().toLowerCase();
            CropFactory cropfactory = new CropFactory(); //new instance of CropFactory called cropfactory
            Crop finalCrop = cropfactory.assignCrop(cropType); //finalCrop = crop (in cropfactory)
            Calculator calc = new Calculator(balance, seedCount, farmingLevel, isTiller, finalCrop);
            int minimumBalance = calc.calculateMinimumBalance();
            int potentialBalance = calc.calculatePotentialBalance();
            Results results = new Results(finalCrop, seedCount, balance, minimumBalance, potentialBalance);
            results.printResults(finalCrop, seedCount);
            System.out.println("Try another crop? (Y/N) ");
            if (sc.nextLine().equalsIgnoreCase("y")) {
                continue;
            } else {
                cont = false;
            }
        }
    }
}
