package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int balance;
    int seedCount;
    double farmingLevel;
    boolean isTiller;
    Crop finalCrop;
    int cost;
    double basicProbability;
    int basicProfit;
    double silverProbability; //max 0.75
    int silverProfit;
    double goldProbability; //fertilizer level currently 0;
    int goldProfit;
    double iridiumProbability;
    int iridiumProfit;
    int reproducingMultiplier;
    int nonReproducingMultiplier;
    final double TILLER_MULTIPLIER = 1.1;

    public Calculator(int balance, int seedCount, double farmingLevel, boolean isTiller, Crop finalCrop) {
        this.balance = balance;
        this.seedCount = seedCount;
        this.farmingLevel = farmingLevel;
        this.isTiller = isTiller;
        this.finalCrop = finalCrop;
    }

    private void setProbabilities(double farmingLevel) {
        goldProbability = 0.2 * (farmingLevel / 10) + (0.2 * 0) * ((farmingLevel + 2) / 12) + 0.01;
        silverProbability = 2 * goldProbability;
        iridiumProbability = goldProbability / 2;
        basicProbability = 1 - (silverProbability + goldProbability + iridiumProbability);
        if (silverProbability > 0.75) {
            silverProbability = 0.75;
        }
    }

    private void setMultipliers() {
        if (finalCrop.isReproducing) {
            reproducingMultiplier = ((28 - finalCrop.timeToMaturity) / finalCrop.timeToRegrow) + 1; //how many times can the reproducing crop produce a harvest in a season?
        } else {
            nonReproducingMultiplier = 28 / finalCrop.timeToMaturity; //how many times can the non-reproducing crop grow and produce a harvest in a season?
        }
    }

    private void setFigures() {
        cost = seedCount * finalCrop.costPerSeed;
        basicProfit = seedCount * finalCrop.basicSellingPrice;
        silverProfit = seedCount * finalCrop.silverSellingPrice;
        goldProfit = seedCount * finalCrop.goldSellingPrice;
        iridiumProfit = seedCount * finalCrop.iridiumSellingPrice;
    }

    public int calculateMinimumBalance() {
        double minimumBalance;
        setProbabilities(farmingLevel);
        setMultipliers();
        setFigures();
        if (finalCrop.isReproducing) {
            if (isTiller) {
                minimumBalance = (balance - cost) + (basicProfit * TILLER_MULTIPLIER * reproducingMultiplier); //10% value increase with tiller profession
            } else {
                minimumBalance = (balance - cost) + (basicProfit * reproducingMultiplier);
            }
        }
        else {
            if (isTiller) {
                minimumBalance = (balance - (cost * nonReproducingMultiplier)) + (basicProfit * TILLER_MULTIPLIER * nonReproducingMultiplier); //10% value increase with tiller profession
            } else {
                minimumBalance = (balance - (cost * nonReproducingMultiplier)) + (basicProfit * nonReproducingMultiplier);
            }
        }
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance() {
        double potentialBalance;
        setProbabilities(farmingLevel);
        setMultipliers();
        setFigures();
        if (finalCrop.isReproducing) {
            if (isTiller) {
                potentialBalance = (balance - (cost)) + (basicProfit * basicProbability * TILLER_MULTIPLIER * reproducingMultiplier) + (silverProfit * silverProbability * TILLER_MULTIPLIER * reproducingMultiplier) + (goldProfit * goldProbability * TILLER_MULTIPLIER * reproducingMultiplier) + (iridiumProfit * iridiumProbability * TILLER_MULTIPLIER * reproducingMultiplier);
            } else {
                potentialBalance = (balance - (cost)) + (basicProfit * basicProbability * reproducingMultiplier) + (silverProfit * silverProbability * reproducingMultiplier) + (goldProfit * goldProbability * reproducingMultiplier) + (iridiumProfit * iridiumProbability * reproducingMultiplier);
            }
        }
        else {
            if (isTiller) {
                potentialBalance = (balance - (cost * nonReproducingMultiplier)) + (basicProfit * basicProbability * TILLER_MULTIPLIER * nonReproducingMultiplier) + (silverProfit * silverProbability * TILLER_MULTIPLIER * nonReproducingMultiplier) + (goldProfit * goldProbability * TILLER_MULTIPLIER * nonReproducingMultiplier) + (iridiumProfit * iridiumProbability * TILLER_MULTIPLIER * nonReproducingMultiplier);
            } else {
                potentialBalance = (balance - (cost * nonReproducingMultiplier)) + (basicProfit * basicProbability * nonReproducingMultiplier) + (silverProfit * silverProbability * nonReproducingMultiplier) + (goldProfit * goldProbability * nonReproducingMultiplier) + (iridiumProfit * iridiumProbability * nonReproducingMultiplier);
            }
        }
        return (int)potentialBalance; //rounds down
    }


}
