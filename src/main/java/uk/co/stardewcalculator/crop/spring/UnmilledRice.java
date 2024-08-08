package uk.co.stardewcalculator.crop.spring;

import uk.co.stardewcalculator.crop.Crop;

public class UnmilledRice extends Crop {
    public UnmilledRice() {
        costPerSeed = 40;
        basicSellingPrice = 30;
        silverSellingPrice = 37;
        goldSellingPrice = 45;
        iridiumSellingPrice = 60;
        timeToMaturity = 6; //irrigated
        isReproducing = false;
    }

    @Override
    public String toString() {
        return "Unmilled Rice";
    }
}
