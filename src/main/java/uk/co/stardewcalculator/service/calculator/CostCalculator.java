package uk.co.stardewcalculator.service.calculator;

import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.CropV2;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

@Component
public class CostCalculator {

    private int calculateCost(CropV2 finalCrop, int seedCount) {
        return seedCount * finalCrop.getCostPerSeed();
    }

    public int calculateBalanceMinusCost(int balance, PlantedCrop finalCrop, int seedCount) {
        int balanceMinusCost;
        if (finalCrop.getCrop().getTimeToRegrow() == null) {
            balanceMinusCost = balance - calculateCost(finalCrop.getCrop(), seedCount);
        }
        else {
            balanceMinusCost = balance - (calculateCost(finalCrop.getCrop(), seedCount) * finalCrop.getCrop().getHarvestsPerSeason());
        }
        return balanceMinusCost;
    }


}
