package uk.co.stardewcalculator.domain.types;

import uk.co.stardewcalculator.domain.season.Season;

import java.util.Map;

public abstract class Crop {
    private int costPerSeed; //from Pierre
    private Map<Quality, Integer> sellingPrices;
    private int timeToMaturity; //how long it takes for the plant to grow from initial planting of seed
    private Season season;

    public Crop() {}

    public Crop(int costPerSeed, Map<Quality, Integer> sellingPrices, int timeToMaturity, Season season) {
        this.costPerSeed = costPerSeed;
        this.sellingPrices = sellingPrices;
        this.timeToMaturity = timeToMaturity;
        this.season = season;
    }

    public int getSellingPrice(Quality quality) {
        return sellingPrices.get(quality);
    }

    public int getCostPerSeed() {
        return costPerSeed;
    }

    public int getTimeToMaturity() {
        return timeToMaturity;
    }

    public int getHarvestsPerSeason() {
        return 28 / timeToMaturity;
    }

    @Override
    public String toString() {
        return "Invalid crop!";
    }
}
