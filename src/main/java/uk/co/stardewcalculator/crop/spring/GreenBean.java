package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class GreenBean extends Crop {
    public GreenBean() {
        costPerSeed = 60;
        sellingPrice = 40; //this continues to produce after maturity
    }

    @Override
    public String toString() {
        return "GreenBean";
    }
}
