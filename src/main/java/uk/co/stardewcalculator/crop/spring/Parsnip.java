package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Parsnip extends Crop {
    public Parsnip() {
        costPerSeed = 20;
        sellingPrice = 35;
    }

    @Override
    public String toString() {
        return "Parsnip";
    }
}
