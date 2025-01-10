package uk.co.stardewcalculator.crop.types;

import uk.co.stardewcalculator.crop.types.Crop;

public class ReproducingCrop extends Crop {

    private final int timeToRegrow;

    public ReproducingCrop(int costPerSeed, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity, int timeToRegrow) {
        super(costPerSeed, basicSellingPrice, silverSellingPrice, goldSellingPrice, iridiumSellingPrice, timeToMaturity);
        this.timeToRegrow = timeToRegrow;
    }

    @Override
    public int getHarvestsPerSeason() {
        return ((28 - getTimeToMaturity()) / timeToRegrow) + 1;
    }

}
