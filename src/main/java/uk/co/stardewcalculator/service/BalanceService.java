package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.Crop;

@Service
public class BalanceService {

    private final BalanceCalculator balanceCalculator;

    @Autowired
    public BalanceService(BalanceCalculator balanceCalculator) {
        this.balanceCalculator = balanceCalculator;
    }

    // TODO: methods can use Player and Crop classes instead of getters here
    public BalanceSummaryResponse getResults(Farm farm, Crop finalCrop, Player player) {
        int minimumBalance = balanceCalculator.calculateMinimumBalance(player.getTiller(), player.getBalance(), finalCrop, farm.getSeedCount());
        int potentialBalance = balanceCalculator.calculatePotentialBalance(player.getTiller(), player.getBalance(), player.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
        return new BalanceSummaryResponse(finalCrop, farm.getSeedCount(), player.getBalance(), minimumBalance, potentialBalance);
    }
}
