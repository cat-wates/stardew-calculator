package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;

import static uk.co.stardewcalculator.domain.types.Quality.*;

@Component
public class RevenueService {

    CropQuality cropQuality;

    @Autowired
    public RevenueService(CropQuality cropQuality) {
        this.cropQuality = cropQuality;
    }

    public double getTotalProfit(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return getPotentialBasicRevenue(farmingLevel, fertilizerLevel, finalCrop, seedCount) + getPotentialSilverRevenue(farmingLevel, fertilizerLevel, finalCrop, seedCount) + getPotentialGoldRevenue(farmingLevel, fertilizerLevel, finalCrop, seedCount) + getPotentialIridiumRevenue(farmingLevel, fertilizerLevel, finalCrop, seedCount);
    }

    public int getCost(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getCostPerSeed();
    }

    /* Minimum profit */
    public int getMinimumBasicRevenue(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getSellingPrice(BASIC);
    }

// TODO: can we squash this down to one method which takes the level of profit as an argument?
    /* Potential profit */
    public double getPotentialBasicRevenue(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getSellingPrice(BASIC) * cropQuality.getBasicProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialSilverRevenue(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getSellingPrice(SILVER) * cropQuality.getSilverProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialGoldRevenue(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getSellingPrice(GOLD) * cropQuality.getGoldProbability(farmingLevel, fertilizerLevel);
    }

    public double getPotentialIridiumRevenue(double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getSellingPrice(IRIDIUM) * cropQuality.getIridiumProbability(farmingLevel, fertilizerLevel);
    }
}
