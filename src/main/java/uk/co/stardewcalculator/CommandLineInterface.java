package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class CommandLineInterface {

    public CommandLineInterface() {
    }

    public static void runProgram() {
        System.out.println("Welcome to the Stardew Valley crop calculator!");
        System.out.println("Based on your farming level, current balance and amount of available tiles, this calculator will work out the profits you'll be able to make for a given crop. :)");
        Scanner sc = new Scanner(System.in);
        UserPrompt userPrompt = new UserPrompt(sc);
        UserInput userInput = new UserInput();
        userInput.promptRunner(userPrompt);
        Player player = new Player(userInput.getFarmingLevel(), userInput.getBalance(), userInput.getTiller(), userInput.getAgriculturalist());
        boolean cont = true;
        UserPrompt pp = new UserPrompt(sc);
        while (cont) {
            Crop finalCrop = pp.setCropChoice();
            Results results = getResults(userInput, finalCrop, player);
            results.printResults(finalCrop, userInput.getSeedCount());
            String retry = pp.retryCropChoice();
            if (!retry.equalsIgnoreCase("y")) {
                cont = false;
            }
        }
    }

    private static Results getResults(UserInput userInput, Crop finalCrop, Player player) {
        CropQuality cropQuality = new CropQuality(userInput.getFarmingLevel(), userInput.getFertilizerLevel());
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, userInput.getSeedCount());
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        int minimumBalance = calc.calculateMinimumBalance();
        int potentialBalance = calc.calculatePotentialBalance();
        return new Results(finalCrop, userInput.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
