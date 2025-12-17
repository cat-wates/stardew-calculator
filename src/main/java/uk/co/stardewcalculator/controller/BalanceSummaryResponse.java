package uk.co.stardewcalculator.controller;

import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.CropV2;

public class BalanceSummaryResponse {

    Player player;
    CropV2 finalCrop;
    int minimumBalance;
    int potentialBalance;

    public BalanceSummaryResponse(Player player, CropV2 finalCrop, int minimumBalance, int potentialBalance) {
        this.finalCrop = finalCrop;
        this.player = player;
        this.minimumBalance = minimumBalance;
        this.potentialBalance = potentialBalance;
    }

    public void printResults(CropV2 finalCrop, Player player) {
        System.out.println("Crop: " + finalCrop);
        System.out.println("Seed amount: " + player.getFarm().getSeedCount());
        System.out.println("Buying price: " + finalCrop.getCostPerSeed() + "g");
        System.out.println("Basic selling price: " + finalCrop.getBasicSellingPrice() + "g");
        System.out.println("Silver selling price: " + finalCrop.getSilverSellingPrice() + "g");
        System.out.println("Gold selling price: " + finalCrop.getGoldSellingPrice() + "g");
        System.out.println("Iridium selling price: " + finalCrop.getIridiumSellingPrice() + "g");
        System.out.println("Old balance: " + player.getBalance() + "g");
        System.out.println("Minimum new balance: " + minimumBalance + "g");
        System.out.println("Potential new balance (based on crop quality probability): " + potentialBalance + "g");
    }

    public CropV2 getFinalCrop() {
        return finalCrop;
    }

    public void setFinalCrop(CropV2 finalCrop) {
        this.finalCrop = finalCrop;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public int getPotentialBalance() {
        return potentialBalance;
    }

    public void setPotentialBalance(int potentialBalance) {
        this.potentialBalance = potentialBalance;
    }
}
