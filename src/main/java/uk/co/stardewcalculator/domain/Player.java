package uk.co.stardewcalculator.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private double farmingLevel;
    private int balance;
    @JsonProperty
    private boolean isTiller; //level 5
    @JsonProperty
    private boolean isAgriculturist; //level 10

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

    public boolean getAgriculturist() {
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
