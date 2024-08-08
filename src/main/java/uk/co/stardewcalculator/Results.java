package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Results {

    Crop finalCrop;
    int seedCount;
    int balance;
    int minimumBalance;
    int potentialBalance;

    public Results(Crop finalCrop, int seedCount, int balance, int minimumBalance, int potentialBalance) {
        this.finalCrop = finalCrop;
        this.seedCount = seedCount;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.potentialBalance = potentialBalance;
    }

    public void printResults(Crop finalCrop, int seedCount) {
        System.out.println("Crop: " + finalCrop);
        System.out.println("Seed amount: " + seedCount);
        System.out.println("Buying price: " + finalCrop.costPerSeed + "g");
        System.out.println("Basic selling price: " + finalCrop.basicSellingPrice + "g");
        System.out.println("Silver selling price: " + finalCrop.silverSellingPrice + "g");
        System.out.println("Gold selling price: " + finalCrop.goldSellingPrice + "g");
        System.out.println("Iridium selling price: " + finalCrop.iridiumSellingPrice + "g");
        System.out.println("Old balance: " + balance + "g");
        System.out.println("Minimum new balance: " + minimumBalance + "g");
        System.out.println("Potential new balance (based on crop quality probability): " + potentialBalance + "g");
    }
}
