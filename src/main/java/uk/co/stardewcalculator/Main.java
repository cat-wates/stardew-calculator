package uk.co.stardewcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Stardew Valley crop calculator!");
        System.out.println("Based on your farming level, current balance and amount of available tiles, this calculator will work out the profits you'll be able to make for a given crop. :)");
        Scanner sc = new Scanner(System.in);
        PlayerPrompt pp = new PlayerPrompt(sc);
        UserInput userInput = new UserInput();
        userInput.promptRunner(pp);
        Player player = new Player(userInput.getFarmingLevel(), userInput.getBalance(), userInput.getTiller(), userInput.getAgriculturalist());
        ResultsFactory rf = new ResultsFactory(player, userInput.getSeedCount(), userInput.getFertilizerLevel(), sc);
        rf.setCropAndCalculateStats();
    }
}