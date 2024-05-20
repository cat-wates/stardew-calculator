package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    int profit;

    public int calculateProfit(int seedCount, Crop finalCrop) {
        profit = (seedCount * finalCrop.sellingPrice) - (seedCount * finalCrop.costPerSeed);
        return profit;
    }


}
