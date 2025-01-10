package uk.co.stardewcalculator.player;

public class Player {

    private final double farmingLevel;
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
