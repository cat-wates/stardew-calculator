package uk.co.stardewcalculator.service.calculator;

import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

@Component
public class CostCalculator {

    private int calculateCost(Crop finalCrop, int seedCount) {
        return seedCount * finalCrop.getCostPerSeed();
    }

    public int calculateBalanceMinusCost(int balance, PlantedCrop finalCrop, int seedCount) {
        int balanceMinusCost;
        if (finalCrop.getCrop() instanceof ReproducingCrop) {
            balanceMinusCost = balance - calculateCost(finalCrop.getCrop(), seedCount);
        }
        else {
            balanceMinusCost = balance - (calculateCost(finalCrop.getCrop(), seedCount) * finalCrop.getCrop().getHarvestsPerSeason());
        }
        return balanceMinusCost;
    }


}
