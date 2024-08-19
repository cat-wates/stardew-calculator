package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

public class Calculator {

    Player player;
    Crop finalCrop;
    CropProfit cropProfit;
    int reproducingMultiplier;
    int nonReproducingMultiplier;
    final double TILLER_MULTIPLIER = 1.1;

    public Calculator(Player player, Crop finalCrop, CropProfit cropProfit) {
        this.player = player;
        this.finalCrop = finalCrop;
        this.cropProfit = cropProfit;
    }

    private void setMultipliers() {
        if (finalCrop.isReproducing) {
            reproducingMultiplier = ((28 - finalCrop.timeToMaturity) / finalCrop.timeToRegrow) + 1; //how many times can the reproducing crop produce a harvest in a season?
        } else {
            nonReproducingMultiplier = 28 / finalCrop.timeToMaturity; //how many times can the non-reproducing crop grow and produce a harvest in a season?
        }
    }

    public int calculateMinimumBalance() {
        double minimumBalance;
        setMultipliers();
        if (finalCrop.isReproducing) {
            if (player.isTiller) {
                minimumBalance = (player.balance - cropProfit.getCost()) + (cropProfit.getMinimumBasicProfit() * TILLER_MULTIPLIER * reproducingMultiplier); //10% value increase with tiller profession
            } else {
                minimumBalance = (player.balance - cropProfit.getCost()) + (cropProfit.getMinimumBasicProfit() * reproducingMultiplier);
            }
        }
        else {
            if (player.isTiller) {
                minimumBalance = (player.balance - (cropProfit.getCost() * nonReproducingMultiplier)) + (cropProfit.getMinimumBasicProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier); //10% value increase with tiller profession
            } else {
                minimumBalance = (player.balance - (cropProfit.getCost() * nonReproducingMultiplier)) + (cropProfit.getMinimumBasicProfit() * nonReproducingMultiplier);
            }
        }
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance() {
        double potentialBalance;
        setMultipliers();
        if (finalCrop.isReproducing) {
            if (player.isTiller) {
                potentialBalance = (player.balance - (cropProfit.getCost())) + (cropProfit.getPotentialBasicProfit() * TILLER_MULTIPLIER * reproducingMultiplier) + (cropProfit.getPotentialSilverProfit() * TILLER_MULTIPLIER * reproducingMultiplier) + (cropProfit.getPotentialGoldProfit() * TILLER_MULTIPLIER * reproducingMultiplier) + (cropProfit.getPotentialIridiumProfit() * TILLER_MULTIPLIER * reproducingMultiplier);
            } else {
                potentialBalance = (player.balance - (cropProfit.getCost())) + (cropProfit.getPotentialBasicProfit() * reproducingMultiplier) + (cropProfit.getPotentialSilverProfit() * reproducingMultiplier) + (cropProfit.getPotentialGoldProfit() * reproducingMultiplier) + (cropProfit.getPotentialIridiumProfit() * reproducingMultiplier);
            }
        }
        else {
            if (player.isTiller) {
                potentialBalance = (player.balance - (cropProfit.getCost() * nonReproducingMultiplier)) + (cropProfit.getPotentialBasicProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier) + (cropProfit.getPotentialSilverProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier) + (cropProfit.getPotentialGoldProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier) + (cropProfit.getPotentialIridiumProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier);
            } else {
                potentialBalance = (player.balance - (cropProfit.getCost() * nonReproducingMultiplier)) + (cropProfit.getPotentialBasicProfit() * nonReproducingMultiplier) + (cropProfit.getPotentialSilverProfit() * nonReproducingMultiplier) + (cropProfit.getPotentialGoldProfit() * nonReproducingMultiplier) + (cropProfit.getPotentialIridiumProfit() * nonReproducingMultiplier);
            }
        }
        return (int)potentialBalance; //rounds down
    }


}
