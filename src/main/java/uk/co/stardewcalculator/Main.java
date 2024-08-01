package uk.co.stardewcalculator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley crop calculator!");
        System.out.println("Based on your farming level, current balance and amount of available tiles, this calculator will work out the profits you'll be able to make for a given crop. :)");
        PlayerPrompt pp = new PlayerPrompt();
        int balance = pp.setBalance();
        double farmingLevel = pp.setFarmingLevel();
        Player player = new Player(farmingLevel, balance);
        player.defineProfessions(farmingLevel);
        int seedCount = pp.setSeedCount();
        pp.setCropAndCalculateStats(balance, farmingLevel, seedCount, player.isTiller);
    }
}