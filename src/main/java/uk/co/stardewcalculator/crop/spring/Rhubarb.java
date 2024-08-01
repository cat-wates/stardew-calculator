package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Rhubarb extends Crop {
    public Rhubarb() {
        costPerSeed = 100;
        basicSellingPrice = 220;
        silverSellingPrice = 275;
        goldSellingPrice = 330;
        iridiumSellingPrice = 440;
    }

    @Override
    public String toString() {
        return "Rhubarb";
    }
}
