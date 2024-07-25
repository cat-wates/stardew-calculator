package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Strawberry extends Crop {
    public Strawberry() {
        costPerSeed = 100;
        basicSellingPrice = 120;
    }

    @Override
    public String toString() {
        return "Strawberry";
    }
}
