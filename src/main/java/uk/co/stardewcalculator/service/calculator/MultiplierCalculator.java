package uk.co.stardewcalculator.service.calculator;

import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.CropV2;

@Component
public class MultiplierCalculator {

    final double TILLER_MULTIPLIER = 1.1;

    public double calculateMultipliers(boolean isTiller, CropV2 finalCrop) {
        double professionMultiplier = 1;
        if (isTiller) {
            professionMultiplier =  TILLER_MULTIPLIER;
        }
        return finalCrop.getHarvestsPerSeason() * professionMultiplier;
    }

}
