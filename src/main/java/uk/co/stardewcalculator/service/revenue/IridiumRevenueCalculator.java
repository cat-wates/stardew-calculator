package uk.co.stardewcalculator.service.revenue;

import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;

import static uk.co.stardewcalculator.domain.types.Quality.IRIDIUM;

public class IridiumRevenueCalculator implements RevenueCalculator {

    @Override
    public double calculateRevenue(double farmingLevel, PlantedCrop finalCrop, CropQuality cropQuality) {
        return finalCrop.getSellingPrice(IRIDIUM) * cropQuality.getIridiumProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }
}
