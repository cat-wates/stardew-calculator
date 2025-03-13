package uk.co.stardewcalculator.service;

import uk.co.stardewcalculator.domain.types.Crop;

public class CropProfit {

    CropQuality cropQuality;

    public CropProfit(CropQuality cropQuality) {
        this.cropQuality = cropQuality;
    }

    public int getCost(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getCostPerSeed();
    }

    /* Minimum profit */
    public int getMinimumBasicProfit(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getBasicSellingPrice();
    }

    /* Potential profit */
    public double getPotentialBasicProfit(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getBasicSellingPrice() * cropQuality.getBasicProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialSilverProfit(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getSilverSellingPrice() * cropQuality.getSilverProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialGoldProfit(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getGoldSellingPrice() * cropQuality.getGoldProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialIridiumProfit(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getIridiumSellingPrice() * cropQuality.getIridiumProbability(farmingLevel, fertilizerLevel);
    }
}
