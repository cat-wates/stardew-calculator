package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int balance;
    double farmingLevel;
    boolean isTiller;
    double goldProbability; //fertilizer level currently 0;
    double silverProbability; //max 0.75 - work out how to incorporate this
    double iridiumProbability;
    double basicProbability;

    public Calculator(int balance, double farmingLevel, boolean isTiller) {
        this.balance = balance;
        this.farmingLevel = farmingLevel;
        this.isTiller = isTiller;
    }

    public void setProbabilities(double farmingLevel) {
        goldProbability = 0.2 * (farmingLevel / 10) + (0.2 * 0) * ((farmingLevel + 2) / 12) + 0.01;
        silverProbability = 2 * goldProbability;
        iridiumProbability = goldProbability / 2;
        basicProbability = 1 - (silverProbability + goldProbability + iridiumProbability);
    }

    public int calculateMinimumBalance(int seedCount, Crop finalCrop) {
        double doubleMinimumBalance;
        if (isTiller) {
            doubleMinimumBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.basicSellingPrice * 1.1); //10% value increase with tiller profession
        } else {
            doubleMinimumBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.basicSellingPrice);

        }
        return (int)doubleMinimumBalance;
    }

    public int calculatePotentialBalance(int seedCount, Crop finalCrop) {
        double doublePotentialBalance;
        if (isTiller) {
            doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * basicProbability * finalCrop.basicSellingPrice * 1.1) + (seedCount * silverProbability * finalCrop.silverSellingPrice * 1.1) + (seedCount * goldProbability * finalCrop.goldSellingPrice * 1.1) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice * 1.1);
        } else {
            doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * basicProbability * finalCrop.basicSellingPrice) + (seedCount * silverProbability * finalCrop.silverSellingPrice) + (seedCount * goldProbability * finalCrop.goldSellingPrice) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice);
        }
        return (int)doublePotentialBalance; //rounds down
    }


}
