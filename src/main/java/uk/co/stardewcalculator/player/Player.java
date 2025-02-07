package uk.co.stardewcalculator.player;

import java.io.Serializable;

public class Player implements Serializable {

    private double farmingLevel;
    private boolean isTiller; //level 5
    private boolean isAgriculturist; //level 10
    private int balance;

    public Player(double farmingLevel, int balance, boolean isTiller, boolean isAgriculturist) {
        this.farmingLevel = farmingLevel;
        this.balance = balance;
        this.isTiller = isTiller;
        this.isAgriculturist = isAgriculturist;
    }

    public Player() {}

    public double getFarmingLevel() {
        return farmingLevel;
    }

    public int getBalance() {
        return balance;
    }

    public boolean getTiller() {
        return isTiller;
    }

    public boolean getAgriculturalist() {
        return isAgriculturist;
    }

    public void setFarmingLevel(double farmingLevel) {
        this.farmingLevel = farmingLevel;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setTiller(boolean isTiller) {
        this.isTiller = isTiller;
    }

    public void setAgriculturist(boolean isAgriculturist) {
        this.isAgriculturist = isAgriculturist;
    }
}
