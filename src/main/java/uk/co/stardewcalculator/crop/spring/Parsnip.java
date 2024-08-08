package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Parsnip extends Crop {
    public Parsnip() {
        costPerSeed = 20;
        basicSellingPrice = 35;
        silverSellingPrice = 43;
        goldSellingPrice = 52;
        iridiumSellingPrice = 70;
        timeToMaturity = 4;
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Parsnip";
    }
}
