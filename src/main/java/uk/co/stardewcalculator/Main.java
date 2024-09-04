package uk.co.stardewcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley crop calculator!");
        System.out.println("Based on your farming level, current balance and amount of available tiles, this calculator will work out the profits you'll be able to make for a given crop. :)");
        Scanner sc = new Scanner(System.in);
        PlayerPrompt pp = new PlayerPrompt(sc);
        int balance = pp.setBalance();
        double farmingLevel = pp.setFarmingLevel();
        boolean isTiller = pp.setTillerChoice(farmingLevel);
        boolean isAgriculturist = pp.setAgriculturalistChoice(farmingLevel);
        Player player = new Player(farmingLevel, balance, isTiller, isAgriculturist);
        int seedCount = pp.setSeedCount();
        int fertilizerLevel = pp.setFertilizerLevel();
        pp.setCropAndCalculateStats(player, seedCount, fertilizerLevel);
    }
}