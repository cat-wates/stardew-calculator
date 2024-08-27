package uk.co.stardewcalculator.crop;

public class ReproducingCrop extends Crop {

    public final int timeToRegrow;

    public ReproducingCrop(int costPerSeed, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity, boolean isReproducing, int timeToRegrow) {
        super(costPerSeed, basicSellingPrice, silverSellingPrice, goldSellingPrice, iridiumSellingPrice, timeToMaturity, isReproducing);
        this.timeToRegrow = timeToRegrow;
    }

    public int getHarvestsPerSeason() {
        return ((28 - timeToMaturity) / timeToRegrow) + 1;
    }

}
