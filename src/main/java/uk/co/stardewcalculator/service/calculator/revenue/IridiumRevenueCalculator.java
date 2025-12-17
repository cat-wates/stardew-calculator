package uk.co.stardewcalculator.service.calculator.revenue;

import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;

@Component
public class IridiumRevenueCalculator implements RevenueCalculator {

    @Override
    public double calculateRevenue(double farmingLevel, PlantedCrop finalCrop, CropQuality cropQuality) {
        return finalCrop.getIridiumSellingPrice() * cropQuality.getIridiumProbability(farmingLevel, finalCrop.getFertilizerLevel());
    }
}
