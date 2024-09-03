package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.ReproducingCrop;

public class Calculator {

    Player player;
    Crop finalCrop;
    CropProfit cropProfit;
    final double TILLER_MULTIPLIER = 1.1;

    public Calculator(Player player, Crop finalCrop, CropProfit cropProfit) {
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

    public int calculatePotentialBalance() {
        double totalProfit = cropProfit.getPotentialBasicProfit() + cropProfit.getPotentialSilverProfit() + cropProfit.getPotentialGoldProfit() + cropProfit.getPotentialIridiumProfit();
        double potentialBalance = calculateBalanceMinusCost() + (totalProfit * calculateMultipliers());
        return (int)potentialBalance; //rounds down
    }
}
