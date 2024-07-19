package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Potato extends Crop {
    public Potato() {
        costPerSeed = 50;
        sellingPrice = 80;
    }

    @Override
    public String toString() {
        return "Potato";
    }
}
