package uk.co.stardewcalculator.cli;

import uk.co.stardewcalculator.service.PredictedBalanceCalculator;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.service.CropProfit;
import uk.co.stardewcalculator.service.CropQuality;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;

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
        boolean cont = true;
        while (cont) {
            Crop finalCrop = cropSelectionPrompt.setCropChoice();
            BalanceSummaryResponse balanceSummaryResponse = getResults(farm, finalCrop, player);
            balanceSummaryResponse.printResults(finalCrop, farm.getSeedCount());
            String retry = cropSelectionPrompt.retryCropChoice();
            if (!retry.equalsIgnoreCase("y")) {
                cont = false;
            }
        }
    }

    private static BalanceSummaryResponse getResults(Farm farm, Crop finalCrop, Player player) {
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, farm.getSeedCount());
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(player, finalCrop, cropProfit);
        int minimumBalance = calc.calculateMinimumBalance();
        int potentialBalance = calc.calculatePotentialBalance(player.getFarmingLevel(), farm.getFertilizerLevel());
        return new BalanceSummaryResponse(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
