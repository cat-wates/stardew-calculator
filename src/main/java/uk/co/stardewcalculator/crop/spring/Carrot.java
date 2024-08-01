package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class Carrot extends Crop {
    public Carrot() {
        costPerSeed = 0;
        basicSellingPrice = 35;
        silverSellingPrice = 43;
        goldSellingPrice = 52;
        iridiumSellingPrice = 70;
    }

    @Override
    public String toString() {
        return "Carrot";
    }
}
