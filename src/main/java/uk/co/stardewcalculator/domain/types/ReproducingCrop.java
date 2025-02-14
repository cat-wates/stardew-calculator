package uk.co.stardewcalculator.domain.types;

import uk.co.stardewcalculator.domain.season.Season;

public class ReproducingCrop extends Crop {

    private final int timeToRegrow;

    public ReproducingCrop(int costPerSeed, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity, Season season, int timeToRegrow) {
        super(costPerSeed, basicSellingPrice, silverSellingPrice, goldSellingPrice, iridiumSellingPrice, timeToMaturity, season);
        this.timeToRegrow = timeToRegrow;
    }

    @Override
    public int getHarvestsPerSeason() {
        return ((28 - getTimeToMaturity()) / timeToRegrow) + 1;
    }

}
