package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class PlayerPrompt {

    public int setBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your current balance? ");
        return Integer.parseInt(sc.nextLine()); //balance
    }

    public double setFarmingLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your farming level? ");
        return Integer.parseInt(sc.nextLine()); //farmingLevel
    }

    public int setSeedCount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many tiles do you have to fill? ");
        return Integer.parseInt(sc.nextLine()); //seedCount
    }

    public void setCropAndCalculateStats(int balance, double farmingLevel, int seedCount) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 1) {
            System.out.println("Which crop? ");
            String cropType = sc.nextLine().toLowerCase();
            CropFactory cropfactory = new CropFactory(); //new instance of CropFactory called cropfactory
            Crop finalCrop = cropfactory.assignCrop(cropType); //finalCrop = crop (in cropfactory)
            Calculator calc = new Calculator(balance, farmingLevel);
            calc.setProbabilities(farmingLevel);
            int minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
            int potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
            Results results = new Results(finalCrop, seedCount, balance, minimumBalance, potentialBalance);
            results.printResults(finalCrop, seedCount);
            System.out.println("Try another crop? (Y/N) ");
            if (sc.nextLine().equals("y")) {
                continue;
            } else {
                i +=1;
            }
        }
    }




}
