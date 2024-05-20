package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Results {

    Crop finalCrop;
    int seedCount;
    int profit;

    public Results(Crop finalCrop, int seedCount, int profit) {
        this.finalCrop = finalCrop;
        this.seedCount = seedCount;
        this.profit = profit;
    }
    public void printResults(Crop finalCrop, int seedCount) {
        System.out.println("Crop: " + finalCrop);
        System.out.println("Seed amount: " + seedCount);
        System.out.println("Buying price: " + finalCrop.costPerSeed + "g");
        System.out.println("Selling price: " + finalCrop.sellingPrice + "g");
        System.out.println("Expected profit: " + profit + "g");
    }
}
