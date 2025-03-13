package uk.co.stardewcalculator.service;

import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.Crop;

public class BalanceSummaryService {
    public static BalanceSummaryResponse getResults(Farm farm, Crop finalCrop, Player player) {
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        int minimumBalance = calc.calculateMinimumBalance(player.getTiller(), player.getBalance(), finalCrop, farm.getSeedCount());
        int potentialBalance = calc.calculatePotentialBalance(player.getTiller(), player.getBalance(), player.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
        return new BalanceSummaryResponse(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
