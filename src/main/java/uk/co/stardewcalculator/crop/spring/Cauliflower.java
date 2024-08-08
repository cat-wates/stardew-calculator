package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Cauliflower extends Crop {
    public Cauliflower() {
        costPerSeed = 80;
        basicSellingPrice = 175;
        silverSellingPrice = 218;
        goldSellingPrice = 262;
        iridiumSellingPrice = 350;
        timeToMaturity = 12;
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Cauliflower";
    }
}
