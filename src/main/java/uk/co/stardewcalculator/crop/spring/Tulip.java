package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Tulip extends Crop {
    public Tulip() {
        costPerSeed = 20;
        basicSellingPrice = 30;
    }

    @Override
    public String toString() {
        return "Tulip";
    }
}
