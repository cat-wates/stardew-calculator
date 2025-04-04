package uk.co.stardewcalculator.service.revenue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.CropQuality;

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

    //TODO move this to balance service for now
    public int getCost(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getCostPerSeed();
    }
}
