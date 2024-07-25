package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int balance;

    public Calculator(int balance) {
        this.balance = balance;
    }

    public int calculateNewBalance(int seedCount, Crop finalCrop) {
        int newBalance =  (balance - (seedCount * finalCrop.costPerSeed)) + (seedCount * finalCrop.sellingPrice);
        return newBalance;
    }


}
