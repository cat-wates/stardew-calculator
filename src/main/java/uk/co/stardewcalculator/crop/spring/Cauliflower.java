package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Cauliflower extends Crop {
    public Cauliflower() {
        costPerSeed = 80;
        sellingPrice = 175;
    }

    @Override
    public String toString() {
        return "Cauliflower";
    }
}
