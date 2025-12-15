package uk.co.stardewcalculator.domain.types;

import uk.co.stardewcalculator.domain.season.SeasonName;

import java.util.Map;

public class ReproducingCrop extends Crop {

    private final int timeToRegrow;

    public ReproducingCrop(int costPerSeed, Map<Quality, Integer> sellingPrices, int timeToMaturity, SeasonName seasonName, int timeToRegrow) {
        super(costPerSeed, sellingPrices, timeToMaturity, seasonName);
        this.timeToRegrow = timeToRegrow;
    }

    @Override
    public int getHarvestsPerSeason() {
        return ((28 - getTimeToMaturity()) / timeToRegrow) + 1;
    }

}
