package uk.co.stardewcalculator.service.revenue;

import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;

import static uk.co.stardewcalculator.domain.types.Quality.BASIC;

public class BasicRevenueCalculator  implements RevenueCalculator{

    @Override
    public double calculateRevenue(double farmingLevel, PlantedCrop finalCrop, CropQuality cropQuality) {
        return finalCrop.getSellingPrice(BASIC) * cropQuality.getBasicProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }
}
