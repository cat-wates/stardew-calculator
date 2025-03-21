package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.Crop;

@Service
public class BalanceSummaryService {

    private final PredictedBalanceCalculator predictedBalanceCalculator;

    @Autowired
    public BalanceSummaryService(PredictedBalanceCalculator predictedBalanceCalculator) {
        this.predictedBalanceCalculator = predictedBalanceCalculator;
    }
    public BalanceSummaryResponse getResults(Farm farm, Crop finalCrop, Player player) {
        int minimumBalance = predictedBalanceCalculator.calculateMinimumBalance(player.getTiller(), player.getBalance(), finalCrop, farm.getSeedCount());
        int potentialBalance = predictedBalanceCalculator.calculatePotentialBalance(player.getTiller(), player.getBalance(), player.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
        return new BalanceSummaryResponse(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
