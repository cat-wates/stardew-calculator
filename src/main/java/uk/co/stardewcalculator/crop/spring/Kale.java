package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Kale extends Crop {
    public Kale() {
        costPerSeed = 70;
        basicSellingPrice = 110;
        silverSellingPrice = 137;
        goldSellingPrice = 165;
        iridiumSellingPrice = 220;
        timeToMaturity = 6;
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
