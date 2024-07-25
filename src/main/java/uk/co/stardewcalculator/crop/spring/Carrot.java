package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Carrot extends Crop {
    public Carrot() {
        costPerSeed = 0;
        basicSellingPrice = 35;
    }

    @Override
    public String toString() {
        return "Carrot";
    }
}
