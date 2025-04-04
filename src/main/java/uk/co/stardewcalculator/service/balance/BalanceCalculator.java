package uk.co.stardewcalculator.service.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;
import uk.co.stardewcalculator.service.revenue.RevenueService;

import static uk.co.stardewcalculator.domain.types.Quality.BASIC;

@Component
public class BalanceCalculator {

    RevenueService revenueService;
    final double TILLER_MULTIPLIER = 1.1;

    @Autowired
    public BalanceCalculator(RevenueService revenueService) {
        this.revenueService = revenueService;
    }

    private int calculateBalanceMinusCost(int balance, PlantedCrop finalCrop, int seedCount) {
        int balanceMinusCost;
        if (finalCrop.getCrop() instanceof ReproducingCrop) {
            balanceMinusCost = balance - revenueService.getCost(finalCrop.getCrop(), seedCount);
        }
        else {
            balanceMinusCost = balance - (revenueService.getCost(finalCrop.getCrop(), seedCount) * finalCrop.getCrop().getHarvestsPerSeason());
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


    public int calculateMinimumBalance(Player player, PlantedCrop finalCrop) {
        double minimumBalance = calculateBalanceMinusCost(player.getBalance(), finalCrop, player.getFarm().getSeedCount()) + (finalCrop.getSellingPrice(BASIC) * calculateMultipliers(player.getTiller(), finalCrop.getCrop()));
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance(Player player, PlantedCrop finalCrop) {
        double totalProfit = revenueService.getTotalRevenue(player.getFarmingLevel(), finalCrop);
        double potentialBalance = calculateBalanceMinusCost(player.getBalance(), finalCrop, player.getFarm().getSeedCount()) + (totalProfit * calculateMultipliers(player.getTiller(), finalCrop.getCrop()));
        return (int)potentialBalance; //rounds down
    }
}
