package uk.co.stardewcalculator;

public class Calculator {
    public int calculateProfit(int seedCount, Crop crop) {
        return (seedCount * crop.sellingPrice) - (seedCount * crop.costPerSeed);
    }


}
