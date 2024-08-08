package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Tulip extends Crop {
    public Tulip() {
        costPerSeed = 20;
        basicSellingPrice = 30;
        silverSellingPrice = 37;
        goldSellingPrice = 45;
        iridiumSellingPrice = 60;
        timeToMaturity = 6;
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
