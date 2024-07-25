package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class BlueJazz extends Crop {
    public BlueJazz() {
        costPerSeed = 30;
        basicSellingPrice = 50;
    }

    @Override
    public String toString() {
        return "Blue Jazz";
    }
}
