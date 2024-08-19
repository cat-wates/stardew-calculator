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
                minimumBalance = (player.balance - cropProfit.setCost()) + (cropProfit.setMinimumBasicProfit() * TILLER_MULTIPLIER * reproducingMultiplier); //10% value increase with tiller profession
            } else {
                minimumBalance = (player.balance - cropProfit.setCost()) + (cropProfit.setMinimumBasicProfit() * reproducingMultiplier);
            }
        }
        else {
            if (player.isTiller) {
                minimumBalance = (player.balance - (cropProfit.setCost() * nonReproducingMultiplier)) + (cropProfit.setMinimumBasicProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier); //10% value increase with tiller profession
            } else {
                minimumBalance = (player.balance - (cropProfit.setCost() * nonReproducingMultiplier)) + (cropProfit.setMinimumBasicProfit() * nonReproducingMultiplier);
            }
        }
        return (int)minimumBalance;
    }

    public int calculatePotentialBalance() {
        double potentialBalance;
        setMultipliers();
        if (finalCrop.isReproducing) {
            if (player.isTiller) {
                potentialBalance = (player.balance - (cropProfit.setCost())) + (cropProfit.setPotentialBasicProfit() * TILLER_MULTIPLIER * reproducingMultiplier) + (cropProfit.setPotentialSilverProfit() * TILLER_MULTIPLIER * reproducingMultiplier) + (cropProfit.setPotentialGoldProfit() * TILLER_MULTIPLIER * reproducingMultiplier) + (cropProfit.setPotentialIridiumProfit() * TILLER_MULTIPLIER * reproducingMultiplier);
            } else {
                potentialBalance = (player.balance - (cropProfit.setCost())) + (cropProfit.setPotentialBasicProfit() * reproducingMultiplier) + (cropProfit.setPotentialSilverProfit() * reproducingMultiplier) + (cropProfit.setPotentialGoldProfit() * reproducingMultiplier) + (cropProfit.setPotentialIridiumProfit() * reproducingMultiplier);
            }
        }
        else {
            if (player.isTiller) {
                potentialBalance = (player.balance - (cropProfit.setCost() * nonReproducingMultiplier)) + (cropProfit.setPotentialBasicProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier) + (cropProfit.setPotentialSilverProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier) + (cropProfit.setPotentialGoldProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier) + (cropProfit.setPotentialIridiumProfit() * TILLER_MULTIPLIER * nonReproducingMultiplier);
            } else {
                potentialBalance = (player.balance - (cropProfit.setCost() * nonReproducingMultiplier)) + (cropProfit.setPotentialBasicProfit() * nonReproducingMultiplier) + (cropProfit.setPotentialSilverProfit() * nonReproducingMultiplier) + (cropProfit.setPotentialGoldProfit() * nonReproducingMultiplier) + (cropProfit.setPotentialIridiumProfit() * nonReproducingMultiplier);
            }
        }
        return (int)potentialBalance; //rounds down
    }


}
