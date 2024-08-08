package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int balance;
    double farmingLevel;
    boolean isTiller;
    double goldProbability; //fertilizer level currently 0;
    double silverProbability; //max 0.75
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
        if (silverProbability > 0.75) {
            silverProbability = 0.75;
        }
    }

    public int calculateMinimumBalance(int seedCount, Crop finalCrop) {
        double doubleMinimumBalance;
        double tillerMultiplier = 1.1;
        if (finalCrop.isReproducing) { //need to test
            int reproducingMultiplier = ((28 - finalCrop.timeToMaturity) / finalCrop.timeToRegrow) + 1; //how many times can the reproducing crop produce a harvest in a season?
            if (isTiller) {
                doubleMinimumBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.basicSellingPrice * tillerMultiplier * reproducingMultiplier); //10% value increase with tiller profession
            } else {
                doubleMinimumBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.basicSellingPrice * reproducingMultiplier);
            }
        }
        else { //tested
            int nonReproducingMultiplier = 28 / finalCrop.timeToMaturity; //how many times can the non-reproducing crop grow and produce a harvest in a season?
            if (isTiller) {
                doubleMinimumBalance = (balance - (seedCount * finalCrop.costPerSeed * nonReproducingMultiplier)) + (seedCount * finalCrop.basicSellingPrice * tillerMultiplier * nonReproducingMultiplier); //10% value increase with tiller profession
            } else {
                doubleMinimumBalance = (balance - (seedCount * finalCrop.costPerSeed * nonReproducingMultiplier)) + (seedCount * finalCrop.basicSellingPrice * nonReproducingMultiplier);
            }
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
