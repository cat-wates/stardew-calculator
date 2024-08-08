package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Garlic extends Crop {
    public Garlic() {
        costPerSeed = 40;
        basicSellingPrice = 60;
        silverSellingPrice = 75;
        goldSellingPrice = 90;
        iridiumSellingPrice = 120;
        timeToMaturity = 4;
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Garlic";
    }
}
