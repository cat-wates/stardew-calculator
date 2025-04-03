package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

import static uk.co.stardewcalculator.domain.types.Quality.*;

@Component
public class RevenueService {

    CropQuality cropQuality;

    @Autowired
    public RevenueService(CropQuality cropQuality) {
        this.cropQuality = cropQuality;
    }

    public double getTotalRevenue(double farmingLevel, PlantedCrop finalCrop) {
        return getPotentialBasicRevenue(farmingLevel, finalCrop)
                + getPotentialSilverRevenue(farmingLevel, finalCrop)
                + getPotentialGoldRevenue(farmingLevel, finalCrop)
                + getPotentialIridiumRevenue(farmingLevel, finalCrop);
    }
    //TODO move this to balance service for now
    public int getCost(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getCostPerSeed();
    }

    // TODO: can we squash this down to one method which takes the level of revenue as an argument? Create 4 separate classes
    /* Potential profit */
    public double getPotentialBasicRevenue(double farmingLevel, PlantedCrop finalCrop) {
        return finalCrop.getSellingPrice(BASIC) * cropQuality.getBasicProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }

    public double getPotentialSilverRevenue(double farmingLevel, PlantedCrop finalCrop) {
        return finalCrop.getSellingPrice(SILVER) * cropQuality.getSilverProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }

    public double getPotentialGoldRevenue(double farmingLevel, PlantedCrop finalCrop) {
        return finalCrop.getSellingPrice(GOLD) * cropQuality.getGoldProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }

    public double getPotentialIridiumRevenue(double farmingLevel, PlantedCrop finalCrop) {
        return finalCrop.getSellingPrice(IRIDIUM) * cropQuality.getIridiumProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }
}
