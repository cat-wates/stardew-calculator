package uk.co.stardewcalculator.service.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

@Service
public class BalanceService {

    private final BalanceCalculator balanceCalculator;

    @Autowired
    public BalanceService(BalanceCalculator balanceCalculator) {
        this.balanceCalculator = balanceCalculator;
    }

    public BalanceSummaryResponse getResults(PlantedCrop finalCrop, Player player) {
        int minimumBalance = balanceCalculator.calculateMinimumBalance(player, finalCrop);
        int potentialBalance = balanceCalculator.calculatePotentialBalance(player, finalCrop);
        return new BalanceSummaryResponse(player, finalCrop.getCrop(), minimumBalance, potentialBalance);
    }
}
