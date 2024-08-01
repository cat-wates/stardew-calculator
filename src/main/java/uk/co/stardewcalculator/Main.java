package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley profit calculator!");
        PlayerPrompt pp = new PlayerPrompt();
        int balance = pp.setBalance();
        double farmingLevel = pp.setFarmingLevel();
        Player player = new Player(farmingLevel, balance);
        player.defineProfessions(farmingLevel);
        int seedCount = pp.setSeedCount();
        pp.setCropAndCalculateStats(balance, farmingLevel, seedCount);
    }
}