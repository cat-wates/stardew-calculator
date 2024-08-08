package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class CoffeeBean extends Crop {
    public CoffeeBean() {
        costPerSeed = 2500;
        basicSellingPrice = 15;
        silverSellingPrice = 18;
        goldSellingPrice = 22;
        iridiumSellingPrice = 30;
        timeToMaturity = 10;
        isReproducing = true;
        timeToRegrow = 2;
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
