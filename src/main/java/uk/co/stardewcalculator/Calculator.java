package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int balance;
    double farmingLevel;
    double goldProbability = 0.2 * (farmingLevel / 10) + (0.2 * 0) * ((farmingLevel + 2) / 12) + 0.01; //fertilizer level currently 0;
    double silverProbability = 2 * goldProbability; //max 0.75 - work out how to incorporate this
    double iridiumProbability = goldProbability / 2;
    double basicProbability = 1 - (goldProbability+silverProbability+iridiumProbability);

    public Calculator(int balance, double farmingLevel) {
        this.balance = balance;
        this.farmingLevel = farmingLevel;
    }

    public int calculateNewBalance(int seedCount, Crop finalCrop) {
        int newBalance =  (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.basicSellingPrice);
        return newBalance;
    }


}
