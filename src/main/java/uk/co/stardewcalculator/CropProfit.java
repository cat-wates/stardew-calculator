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

    public int setCost() {
        return seedCount * finalCrop.costPerSeed;
    }

    /* Minimum profit */
    public int setMinimumBasicProfit() {
        return seedCount * finalCrop.basicSellingPrice;
    }

    /* Potential profit */
    public double setPotentialBasicProfit() {
        return seedCount * finalCrop.basicSellingPrice * cropQuality.getBasicProbability();
    }

    public double setPotentialSilverProfit() {
        return seedCount * finalCrop.silverSellingPrice * cropQuality.getSilverProbability();
    }

    public double setPotentialGoldProfit() {
        return seedCount * finalCrop.goldSellingPrice * cropQuality.getGoldProbability();
    }

    public double setPotentialIridiumProfit() {
        return seedCount * finalCrop.iridiumSellingPrice * cropQuality.getIridiumProbability();
    }


}
