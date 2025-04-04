package uk.co.stardewcalculator.service.revenue;

import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;

import static uk.co.stardewcalculator.domain.types.Quality.SILVER;

public class SilverRevenueCalculator implements RevenueCalculator {

    @Override
    public double calculateRevenue(double farmingLevel, PlantedCrop finalCrop, CropQuality cropQuality) {
        return finalCrop.getSellingPrice(SILVER) * cropQuality.getSilverProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }
}
