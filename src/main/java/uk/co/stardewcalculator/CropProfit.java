package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

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
        return seedCount * finalCrop.costPerSeed;
    }

    /* Minimum profit */
    public int getMinimumBasicProfit() {
        return seedCount * finalCrop.basicSellingPrice;
    }

    /* Potential profit */
    public double getPotentialBasicProfit() {
        return seedCount * finalCrop.basicSellingPrice * cropQuality.getBasicProbability();
    }

    public double getPotentialSilverProfit() {
        return seedCount * finalCrop.silverSellingPrice * cropQuality.getSilverProbability();
    }

    public double getPotentialGoldProfit() {
        return seedCount * finalCrop.goldSellingPrice * cropQuality.getGoldProbability();
    }

    public double getPotentialIridiumProfit() {
        return seedCount * finalCrop.iridiumSellingPrice * cropQuality.getIridiumProbability();
    }



}
