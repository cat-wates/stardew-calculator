package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Kale extends Crop {
    public Kale() {
        costPerSeed = 70;
        sellingPrice = 110;
    }

    @Override
    public String toString() {
        return "Kale";
    }
}
