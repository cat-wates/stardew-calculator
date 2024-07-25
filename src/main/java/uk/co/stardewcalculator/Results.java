package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Results {

    Crop finalCrop;
    int seedCount;
    int balance;
    int newBalance;

    public Results(Crop finalCrop, int seedCount, int balance, int newBalance) {
        this.finalCrop = finalCrop;
        this.seedCount = seedCount;
        this.balance = balance;
        this.newBalance = newBalance;
    }
    public void printResults(Crop finalCrop, int seedCount) {
        System.out.println("Crop: " + finalCrop);
        System.out.println("Seed amount: " + seedCount);
        System.out.println("Buying price: " + finalCrop.costPerSeed + "g");
        System.out.println("Selling price: " + finalCrop.basicSellingPrice + "g");
        System.out.println("Old balance: " + balance + "g");
        System.out.println("New balance: " + newBalance + "g");
    }
}
