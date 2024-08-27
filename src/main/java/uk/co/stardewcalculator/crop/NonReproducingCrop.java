package uk.co.stardewcalculator.crop;

public class NonReproducingCrop extends Crop {

    public NonReproducingCrop(int costPerSeed, int basicSellingPrice, int silverSellingPrice, int goldSellingPrice, int iridiumSellingPrice, int timeToMaturity, boolean isReproducing) {
        super(costPerSeed, basicSellingPrice, silverSellingPrice, goldSellingPrice, iridiumSellingPrice, timeToMaturity, isReproducing);
    }

    public int getHarvestsPerSeason() {
        return 28 / timeToMaturity;
    }
}
