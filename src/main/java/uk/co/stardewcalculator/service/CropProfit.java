package uk.co.stardewcalculator.service;

import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.service.CropQuality;

public class CropProfit {

    CropQuality cropQuality;
    Crop finalCrop;
    int seedCount;

    public CropProfit(CropQuality cropQuality, Crop finalCrop, int seedCount) {
        this.cropQuality = cropQuality;
        this.finalCrop = finalCrop;
        this.seedCount = seedCount;
    }

    public int getCost() {
        return seedCount * finalCrop.getCostPerSeed();
    }

    /* Minimum profit */
    public int getMinimumBasicProfit() {
        return seedCount * finalCrop.getBasicSellingPrice();
    }

    /* Potential profit */
    public double getPotentialBasicProfit(double farmingLevel, int fertilizerLevel) {
        return seedCount * finalCrop.getBasicSellingPrice() * cropQuality.getBasicProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialSilverProfit(double farmingLevel, int fertilizerLevel) {
        return seedCount * finalCrop.getSilverSellingPrice() * cropQuality.getSilverProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialGoldProfit(double farmingLevel, int fertilizerLevel) {
        return seedCount * finalCrop.getGoldSellingPrice() * cropQuality.getGoldProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialIridiumProfit(double farmingLevel, int fertilizerLevel) {
        return seedCount * finalCrop.getIridiumSellingPrice() * cropQuality.getIridiumProbability(farmingLevel, fertilizerLevel);
    }
}
