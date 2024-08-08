package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Potato extends Crop {
    public Potato() {
        costPerSeed = 50;
        basicSellingPrice = 80;
        silverSellingPrice = 100;
        goldSellingPrice = 120;
        iridiumSellingPrice = 160;
        timeToMaturity = 6;
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
