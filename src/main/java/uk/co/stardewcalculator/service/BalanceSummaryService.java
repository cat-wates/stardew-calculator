package uk.co.stardewcalculator.service;

import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.Crop;

public class BalanceSummaryService {
    public static BalanceSummaryResponse getResults(Farm farm, Crop finalCrop, Player player) {
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), farm.getFertilizerLevel());
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, farm.getSeedCount());
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(player, finalCrop, cropProfit);
        int minimumBalance = calc.calculateMinimumBalance();
        int potentialBalance = calc.calculatePotentialBalance();
        return new BalanceSummaryResponse(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
