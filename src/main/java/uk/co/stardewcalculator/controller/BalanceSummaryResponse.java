package uk.co.stardewcalculator.controller;

import uk.co.stardewcalculator.domain.types.Crop;

import static uk.co.stardewcalculator.domain.types.Quality.*;

public class BalanceSummaryResponse {

    Crop finalCrop;
    int seedCount;
    int balance;
    int minimumBalance;
    int potentialBalance;

    public BalanceSummaryResponse(Crop finalCrop, int seedCount, int balance, int minimumBalance, int potentialBalance) {
        this.finalCrop = finalCrop;
        this.seedCount = seedCount;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.potentialBalance = potentialBalance;
    }

    public void printResults(Crop finalCrop, int seedCount) {
        System.out.println("Crop: " + finalCrop);
        System.out.println("Seed amount: " + seedCount);
        System.out.println("Buying price: " + finalCrop.getCostPerSeed() + "g");
        System.out.println("Basic selling price: " + finalCrop.getSellingPrice(BASIC) + "g");
        System.out.println("Silver selling price: " + finalCrop.getSellingPrice(SILVER) + "g");
        System.out.println("Gold selling price: " + finalCrop.getSellingPrice(GOLD) + "g");
        System.out.println("Iridium selling price: " + finalCrop.getSellingPrice(IRIDIUM) + "g");
        System.out.println("Old balance: " + balance + "g");
        System.out.println("Minimum new balance: " + minimumBalance + "g");
        System.out.println("Potential new balance (based on crop quality probability): " + potentialBalance + "g");
    }

    public Crop getFinalCrop() {
        return finalCrop;
    }

    public void setFinalCrop(Crop finalCrop) {
        this.finalCrop = finalCrop;
    }

    public int getSeedCount() {
        return seedCount;
    }

    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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
