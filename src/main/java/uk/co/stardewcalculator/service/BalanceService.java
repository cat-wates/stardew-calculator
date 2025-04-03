package uk.co.stardewcalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.Crop;

@Service
public class BalanceService {

    private final BalanceCalculator balanceCalculator;

    @Autowired
    public BalanceService(BalanceCalculator balanceCalculator) {
        this.balanceCalculator = balanceCalculator;
    }

    public BalanceSummaryResponse getResults(Crop finalCrop, Player player) {
        int minimumBalance = balanceCalculator.calculateMinimumBalance(player, finalCrop);
        int potentialBalance = balanceCalculator.calculatePotentialBalance(player, finalCrop);
        return new BalanceSummaryResponse(player, finalCrop, minimumBalance, potentialBalance);
    }
}
