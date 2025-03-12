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
    private String username;
    private double farmingLevel;
    private int balance;

    @JsonProperty
    private boolean isTiller; //level 5

    @JsonProperty
    private boolean isAgriculturist; //level 10

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "farm_id")
    private Farm farm;

    public Player(String username, double farmingLevel, int balance, boolean isTiller, boolean isAgriculturist, Farm farm) {
        this.username = username;
        this.farmingLevel = farmingLevel;
        this.balance = balance;
        this.isTiller = isTiller;
        this.isAgriculturist = isAgriculturist;
        this.farm = farm;
    }

    public Player() {}

    public String getUsername() {
        return username;
    }

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

    public Farm getFarm() {
        return farm;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
