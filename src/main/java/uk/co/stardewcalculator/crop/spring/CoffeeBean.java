package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class CoffeeBean extends Crop {
    public CoffeeBean() {
        costPerSeed = 2500;
        sellingPrice = 15;
    }

    @Override
    public String toString() {
        return "Coffee Bean";
    }
}
