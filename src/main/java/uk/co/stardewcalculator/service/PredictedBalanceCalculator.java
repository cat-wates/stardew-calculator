package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

@Component
public class PredictedBalanceCalculator {

    CropProfit cropProfit;
    final double TILLER_MULTIPLIER = 1.1;

    @Autowired
    public PredictedBalanceCalculator(CropProfit cropProfit) {
        this.cropProfit = cropProfit;
    }

    private int calculateBalanceMinusCost(int balance, Crop finalCrop, int seedCount) {
        int balanceMinusCost;
        if (finalCrop instanceof ReproducingCrop) {
            balanceMinusCost = balance - cropProfit.getCost(finalCrop, seedCount);
        }
        else {
            balanceMinusCost = balance - (cropProfit.getCost(finalCrop, seedCount) * finalCrop.getHarvestsPerSeason());
        }
        return balanceMinusCost;
    }

    private double calculateMultipliers(boolean isTiller, Crop finalCrop) {
        double professionMultiplier = 1;
        if (isTiller) {
           professionMultiplier =  TILLER_MULTIPLIER;
        }
        return finalCrop.getHarvestsPerSeason() * professionMultiplier;
    }


    public int calculateMinimumBalance(boolean isTiller, int balance, Crop finalCrop, int seedCount) {
        double minimumBalance = calculateBalanceMinusCost(balance, finalCrop, seedCount) + (cropProfit.getMinimumBasicProfit(finalCrop, seedCount) * calculateMultipliers(isTiller, finalCrop));
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance(boolean isTiller, int balance, double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        double totalProfit = cropProfit.getPotentialBasicProfit(farmingLevel, fertilizerLevel, finalCrop, seedCount) + cropProfit.getPotentialSilverProfit(farmingLevel, fertilizerLevel, finalCrop, seedCount) + cropProfit.getPotentialGoldProfit(farmingLevel, fertilizerLevel, finalCrop, seedCount) + cropProfit.getPotentialIridiumProfit(farmingLevel, fertilizerLevel, finalCrop, seedCount);
        double potentialBalance = calculateBalanceMinusCost(balance, finalCrop, seedCount) + (totalProfit * calculateMultipliers(isTiller, finalCrop));
        return (int)potentialBalance; //rounds down
    }
}
