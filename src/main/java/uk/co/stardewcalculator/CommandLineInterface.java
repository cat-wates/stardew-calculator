package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.CropProfit;
import uk.co.stardewcalculator.crop.CropQuality;
import uk.co.stardewcalculator.crop.CropSelectionPrompt;
import uk.co.stardewcalculator.crop.types.Crop;
import uk.co.stardewcalculator.farm.Farm;
import uk.co.stardewcalculator.farm.FarmPromptRunner;
import uk.co.stardewcalculator.player.Player;
import uk.co.stardewcalculator.player.PlayerPromptRunner;

import java.util.Scanner;

public class CommandLineInterface {

    Scanner sc;
    PlayerPromptRunner playerPromptRunner;
    FarmPromptRunner farmPromptRunner;


    public CommandLineInterface(Scanner sc, PlayerPromptRunner playerPromptRunner, FarmPromptRunner farmPromptRunner) {
        this.sc = sc;
        this.playerPromptRunner = playerPromptRunner;
        this.farmPromptRunner = farmPromptRunner;
    }

    public void runProgram() {
        System.out.println("Welcome to the Stardew Valley crop calculator!");
        System.out.println("Based on your farming level, current balance and amount of available tiles, this calculator will work out the profits you'll be able to make for a given crop. :)");
        Player player = playerPromptRunner.run();
        Farm farm = farmPromptRunner.run();
        CropSelectionPrompt cropSelectionPrompt = new CropSelectionPrompt(sc);
//      playerPromptRunner.run() -> Player
//      While app is still running CropSelectionPrompt.run()
//      Calculate profit summary - ProfitSummary.generate()
        boolean cont = true;
        while (cont) {
            Crop finalCrop = cropSelectionPrompt.setCropChoice();
            Results results = getResults(farm, finalCrop, player);
            results.printResults(finalCrop, farm.getSeedCount());
            String retry = cropSelectionPrompt.retryCropChoice();
            if (!retry.equalsIgnoreCase("y")) {
                cont = false;
            }
        }
    }

    private static Results getResults(Farm farm, Crop finalCrop, Player player) {
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), farm.getFertilizerLevel());
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, farm.getSeedCount());
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        int minimumBalance = calc.calculateMinimumBalance();
        int potentialBalance = calc.calculatePotentialBalance();
        return new Results(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
