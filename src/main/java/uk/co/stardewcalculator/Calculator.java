package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int balance;
    double farmingLevel;
    double goldProbability; //fertilizer level currently 0;
    double silverProbability; //max 0.75 - work out how to incorporate this
    double iridiumProbability;
    double basicProbability;

    public Calculator(int balance, double farmingLevel) {
        this.balance = balance;
        this.farmingLevel = farmingLevel;
    }

    public void setProbabilities(double farmingLevel) {
        goldProbability = 0.2 * (farmingLevel / 10) + (0.2 * 0) * ((farmingLevel + 2) / 12) + 0.01;
        silverProbability = 2 * goldProbability;
        iridiumProbability = goldProbability / 2;
        basicProbability = 1 - (silverProbability + goldProbability + iridiumProbability);
    }

    public int calculateMinimumBalance(int seedCount, Crop finalCrop) {
        int minimumBalance =  (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.basicSellingPrice);
        return minimumBalance;
    }

    public int calculatePotentialBalance(int seedCount, Crop finalCrop) {
        double doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * basicProbability * finalCrop.basicSellingPrice) + (seedCount * silverProbability * finalCrop.silverSellingPrice) + (seedCount * goldProbability * finalCrop.goldSellingPrice) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice);
        return (int)doublePotentialBalance;
    }


}
