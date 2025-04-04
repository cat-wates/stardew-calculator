package uk.co.stardewcalculator.service.revenue;

import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;

import static uk.co.stardewcalculator.domain.types.Quality.GOLD;

@Component
public class GoldRevenueCalculator implements RevenueCalculator {

    @Override
    public double calculateRevenue(double farmingLevel, PlantedCrop finalCrop, CropQuality cropQuality) {
        return finalCrop.getSellingPrice(GOLD) * cropQuality.getGoldProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }
}
