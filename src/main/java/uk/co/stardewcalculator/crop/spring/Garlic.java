package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Garlic extends Crop {
    public Garlic() {
        costPerSeed = 40;
        sellingPrice = 60;
    }

    @Override
    public String toString() {
        return "Garlic";
    }
}
