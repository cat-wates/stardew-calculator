package uk.co.stardewcalculator.service;

import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.ReproducingCrop;
import uk.co.stardewcalculator.domain.Player;

public class PredictedBalanceCalculator {

    Player player;
    Crop finalCrop;
    CropProfit cropProfit;
    final double TILLER_MULTIPLIER = 1.1;

    public PredictedBalanceCalculator(Player player, Crop finalCrop, CropProfit cropProfit) {
        this.player = player;
        this.finalCrop = finalCrop;
        this.cropProfit = cropProfit;
    }

    private int calculateBalanceMinusCost() {
        int balanceMinusCost;
        if (finalCrop instanceof ReproducingCrop) {
            balanceMinusCost = player.getBalance() - cropProfit.getCost();
        }
        else {
            balanceMinusCost = player.getBalance() - (cropProfit.getCost() * finalCrop.getHarvestsPerSeason());
        }
        return balanceMinusCost;
    }

    private double calculateMultipliers() {
        double professionMultiplier = 1;
        if (player.getTiller()) {
           professionMultiplier =  TILLER_MULTIPLIER;
        }
        return finalCrop.getHarvestsPerSeason() * professionMultiplier;
    }


    public int calculateMinimumBalance() {
        double minimumBalance = calculateBalanceMinusCost() + (cropProfit.getMinimumBasicProfit() * calculateMultipliers());
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance(double farmingLevel, int fertilizerLevel) {
        double totalProfit = cropProfit.getPotentialBasicProfit(farmingLevel, fertilizerLevel) + cropProfit.getPotentialSilverProfit(farmingLevel, fertilizerLevel) + cropProfit.getPotentialGoldProfit(farmingLevel, fertilizerLevel) + cropProfit.getPotentialIridiumProfit(farmingLevel, fertilizerLevel);
        double potentialBalance = calculateBalanceMinusCost() + (totalProfit * calculateMultipliers());
        return (int)potentialBalance; //rounds down
    }
}
