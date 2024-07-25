package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class UnmilledRice extends Crop {
    public UnmilledRice() {
        costPerSeed = 40;
        basicSellingPrice = 30;
    }

    @Override
    public String toString() {
        return "Unmilled Rice";
    }
}
