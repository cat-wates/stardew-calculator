package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {
    public int calculateProfit(int seedCount, Crop crop) {
        return (seedCount * crop.sellingPrice) - (seedCount * crop.costPerSeed);
    }


}
