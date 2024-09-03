package uk.co.stardewcalculator;

public class Player {

    private final double farmingLevel;
    private final int fertilizerLevel = 0;
    private final boolean isTiller; //level 5
    private final boolean isAgriculturist; //level 10
    private final int balance;

    public Player(double farmingLevel, int balance, boolean isTiller, boolean isAgriculturist) {
        this.farmingLevel = farmingLevel;
        this.balance = balance;
        this.isTiller = isTiller;
        this.isAgriculturist = isAgriculturist;
    }

    public double getFarmingLevel() {
        return farmingLevel;
    }

    public int getFertilizerLevel() {
        return fertilizerLevel;
    }

    public boolean getTiller() {
        return isTiller;
    }

    public boolean getAgriculturalist() {
        return isAgriculturist;
    }

    public int getBalance() {
        return balance;
    }

}
