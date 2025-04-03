package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.Player;
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


    public int calculateMinimumBalance(Player player, Crop finalCrop) {
        double minimumBalance = calculateBalanceMinusCost(player.getBalance(), finalCrop, player.getFarm().getSeedCount()) + (revenueService.getMinimumBasicRevenue(finalCrop, player.getFarm().getSeedCount()) * calculateMultipliers(player.getTiller(), finalCrop));
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance(Player player, Crop finalCrop) {
        double totalProfit = revenueService.getTotalProfit(player.getFarmingLevel(), player.getFarm().getFertilizerLevel(), finalCrop, player.getFarm().getSeedCount());
        double potentialBalance = calculateBalanceMinusCost(player.getBalance(), finalCrop, player.getFarm().getSeedCount()) + (totalProfit * calculateMultipliers(player.getTiller(), finalCrop));
        return (int)potentialBalance; //rounds down
    }
}
