package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Strawberry extends Crop {
    public Strawberry() {
        costPerSeed = 100;
        basicSellingPrice = 120;
        silverSellingPrice = 150;
        goldSellingPrice = 180;
        iridiumSellingPrice = 240;
        timeToMaturity = 8;
        isReproducing = true;
        timeToRegrow = 4;
    }

    @Override
    public String toString() {
        return "Strawberry";
    }
}
