package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class BlueJazz extends Crop {
    public BlueJazz() {
        costPerSeed = 30;
        sellingPrice = 50;
    }

    @Override
    public String toString() {
        return "Blue Jazz";
    }
}
