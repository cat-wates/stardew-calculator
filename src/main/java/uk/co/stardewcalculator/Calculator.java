package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.ReproducingCrop;

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
        if (finalCrop instanceof ReproducingCrop) {
            reproducingMultiplier = ((28 - finalCrop.timeToMaturity) / ((ReproducingCrop) finalCrop).timeToRegrow) + 1; //how many times can the reproducing crop produce a harvest in a season?
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
                potentialBalance = (player.balance - (cropProfit.getCost())) + (cropProfit.getPotentialBasicProfit() + cropProfit.getPotentialSilverProfit() + cropProfit.getPotentialGoldProfit() + cropProfit.getPotentialIridiumProfit()) * TILLER_MULTIPLIER * reproducingMultiplier;
            } else {
                potentialBalance = (player.balance - (cropProfit.getCost())) + (cropProfit.getPotentialBasicProfit() + cropProfit.getPotentialSilverProfit() + cropProfit.getPotentialGoldProfit() + cropProfit.getPotentialIridiumProfit()) * reproducingMultiplier;
            }
        }
        else {
            if (player.isTiller) {
                potentialBalance = (player.balance - (cropProfit.getCost() * nonReproducingMultiplier)) + (cropProfit.getPotentialBasicProfit() + cropProfit.getPotentialSilverProfit() + cropProfit.getPotentialGoldProfit() + cropProfit.getPotentialIridiumProfit()) * TILLER_MULTIPLIER * nonReproducingMultiplier;
            } else {
                potentialBalance = (player.balance - (cropProfit.getCost() * nonReproducingMultiplier)) + (cropProfit.getPotentialBasicProfit() + cropProfit.getPotentialSilverProfit() + cropProfit.getPotentialGoldProfit() + cropProfit.getPotentialIridiumProfit()) * nonReproducingMultiplier;
            }
        }
        return (int)potentialBalance; //rounds down
    }


}
