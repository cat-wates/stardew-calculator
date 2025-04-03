package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;

@Component
public class BalanceCalculator {

    RevenueService revenueService;
    final double TILLER_MULTIPLIER = 1.1;

    @Autowired
    public BalanceCalculator(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    private int calculateBalanceMinusCost(int balance, Crop finalCrop, int seedCount) {
        int balanceMinusCost;
        if (finalCrop instanceof ReproducingCrop) {
            balanceMinusCost = balance - revenueService.getCost(finalCrop, seedCount);
        }
        else {
            balanceMinusCost = balance - (revenueService.getCost(finalCrop, seedCount) * finalCrop.getHarvestsPerSeason());
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
        double minimumBalance = calculateBalanceMinusCost(balance, finalCrop, seedCount) + (revenueService.getMinimumBasicRevenue(finalCrop, seedCount) * calculateMultipliers(isTiller, finalCrop));
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance(boolean isTiller, int balance, double farmingLevel, int fertilizerLevel, Crop finalCrop, int seedCount) {
        double totalProfit = revenueService.getTotalProfit(farmingLevel, fertilizerLevel, finalCrop, seedCount);
        double potentialBalance = calculateBalanceMinusCost(balance, finalCrop, seedCount) + (totalProfit * calculateMultipliers(isTiller, finalCrop));
        return (int)potentialBalance; //rounds down
    }
}
