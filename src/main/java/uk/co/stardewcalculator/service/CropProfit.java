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
    public double getPotentialBasicProfit() {
        return seedCount * finalCrop.getBasicSellingPrice() * cropQuality.getBasicProbability();
    }

    public double getPotentialSilverProfit() {
        return seedCount * finalCrop.getSilverSellingPrice() * cropQuality.getSilverProbability();
    }

    public double getPotentialGoldProfit() {
        return seedCount * finalCrop.getGoldSellingPrice() * cropQuality.getGoldProbability();
    }

    public double getPotentialIridiumProfit() {
        return seedCount * finalCrop.getIridiumSellingPrice() * cropQuality.getIridiumProbability();
    }
}
