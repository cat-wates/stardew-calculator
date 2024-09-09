package uk.co.stardewcalculator;

import uk.co.stardewcalculator.crop.Crop;

import java.util.Scanner;

public class ResultsFactory {

    Player player;
    int seedCount;
    int fertilizerLevel;
    Scanner sc;

    public ResultsFactory(Player player, int seedCount, int fertilizerLevel, Scanner sc) {
        this.player = player;
        this.seedCount = seedCount;
        this.fertilizerLevel = fertilizerLevel;
        this.sc = sc;
    }

    public void setCropAndCalculateStats(Player player, int seedCount, int fertilizerLevel) {
        boolean cont = true;
        PlayerPrompt pp = new PlayerPrompt(sc);
        while (cont) {
            Crop finalCrop = pp.setCropChoice();
            CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
            CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
            Calculator calc = new Calculator(player, finalCrop, cropProfit);
            int minimumBalance = calc.calculateMinimumBalance();
            int potentialBalance = calc.calculatePotentialBalance();
            Results results = new Results(finalCrop, seedCount, player.getBalance(), minimumBalance, potentialBalance);
            results.printResults(finalCrop, seedCount);
            String retry = pp.retryCropChoice();
            if (!retry.equalsIgnoreCase("y")) {
                cont = false;
            }
        }
    }
}
