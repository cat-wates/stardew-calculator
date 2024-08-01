package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class BlueJazz extends Crop {
    public BlueJazz() {
        costPerSeed = 30;
        basicSellingPrice = 50;
        silverSellingPrice = 62;
        goldSellingPrice = 75;
        iridiumSellingPrice = 100;
    }

    @Override
    public String toString() {
        return "Blue Jazz";
    }
}
