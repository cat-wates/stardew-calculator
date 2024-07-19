package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Rhubarb extends Crop {
    public Rhubarb() {
        costPerSeed = 100;
        sellingPrice = 220;
    }

    @Override
    public String toString() {
        return "Rhubarb";
    }
}
