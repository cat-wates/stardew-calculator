package uk.co.stardewcalculator;

public class Player {

    public double farmingLevel;
    public int fertilizerLevel = 0;
    public boolean isTiller; //level 5
    public boolean isAgriculturist; //level 10
    public int balance;

    public Player(double farmingLevel, int balance, boolean isTiller, boolean isAgriculturist) {
        this.farmingLevel = farmingLevel;
        this.balance = balance;
        this.isTiller = isTiller;
        this.isAgriculturist = isAgriculturist;
    }
}
