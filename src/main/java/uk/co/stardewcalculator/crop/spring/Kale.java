package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Kale extends Crop {
    public Kale() {
        costPerSeed = 70;
        basicSellingPrice = 110;
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
