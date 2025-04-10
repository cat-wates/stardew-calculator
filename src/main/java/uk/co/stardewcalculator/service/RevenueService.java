package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.calculator.revenue.RevenueCalculator;

import java.util.List;

@Component
public class RevenueService {

    CropQuality cropQuality;
    List<RevenueCalculator> revenueCalculations; //Spring allows us to inject all available beans of a specific type into a collection

    @Autowired
    public RevenueService(CropQuality cropQuality, List<RevenueCalculator> revenueCalculations) {
        this.cropQuality = cropQuality;
        this.revenueCalculations = revenueCalculations;
    }

    public double getTotalRevenue(double farmingLevel, PlantedCrop finalCrop) {
        double totalRevenue = 0;
        for (RevenueCalculator revenueCalculator : revenueCalculations) {
            totalRevenue += revenueCalculator.calculateRevenue(farmingLevel, finalCrop, cropQuality);
        }
        return totalRevenue;
    }
}
