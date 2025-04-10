package uk.co.stardewcalculator.service.calculator.revenue;

import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;


public interface RevenueCalculator {

    double calculateRevenue(double farmingLevel, PlantedCrop finalCrop, CropQuality cropQuality);
}
