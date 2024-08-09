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
    double tillerMultiplier = 1.1;

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
        if (finalCrop.isReproducing) { //tested
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
        if (finalCrop.isReproducing) {
            int reproducingMultiplier = ((28 - finalCrop.timeToMaturity) / finalCrop.timeToRegrow) + 1;
            if (isTiller) {
                doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * basicProbability * finalCrop.basicSellingPrice * tillerMultiplier * reproducingMultiplier) + (seedCount * silverProbability * finalCrop.silverSellingPrice * tillerMultiplier * reproducingMultiplier) + (seedCount * goldProbability * finalCrop.goldSellingPrice * tillerMultiplier * reproducingMultiplier) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice * tillerMultiplier * reproducingMultiplier);
            } else {
                doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * basicProbability * finalCrop.basicSellingPrice * reproducingMultiplier) + (seedCount * silverProbability * finalCrop.silverSellingPrice * reproducingMultiplier) + (seedCount * goldProbability * finalCrop.goldSellingPrice * reproducingMultiplier) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice * reproducingMultiplier);
            }
        }
        else {
            int nonReproducingMultiplier = 28 / finalCrop.timeToMaturity;
            if (isTiller) {
                doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed * nonReproducingMultiplier)) + (seedCount * basicProbability * finalCrop.basicSellingPrice * tillerMultiplier * nonReproducingMultiplier) + (seedCount * silverProbability * finalCrop.silverSellingPrice * tillerMultiplier * nonReproducingMultiplier) + (seedCount * goldProbability * finalCrop.goldSellingPrice * tillerMultiplier * nonReproducingMultiplier) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice * tillerMultiplier * nonReproducingMultiplier);
            } else {
                doublePotentialBalance = (balance - (seedCount * finalCrop.costPerSeed * nonReproducingMultiplier)) + (seedCount * basicProbability * finalCrop.basicSellingPrice * nonReproducingMultiplier) + (seedCount * silverProbability * finalCrop.silverSellingPrice * nonReproducingMultiplier) + (seedCount * goldProbability * finalCrop.goldSellingPrice * nonReproducingMultiplier) + (seedCount * iridiumProbability * finalCrop.iridiumSellingPrice * nonReproducingMultiplier);
            }
        }
        return (int)doublePotentialBalance; //rounds down
    }


}
