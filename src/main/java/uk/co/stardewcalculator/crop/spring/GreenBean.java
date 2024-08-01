package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class GreenBean extends Crop {
    public GreenBean() {
        costPerSeed = 60;
        basicSellingPrice = 40; //this continues to produce after maturity
        silverSellingPrice = 50;
        goldSellingPrice = 60;
        iridiumSellingPrice = 80;
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
