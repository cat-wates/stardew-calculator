package uk.co.stardewcalculator.service.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

import java.util.List;

@Service
public class BalanceService {

    List<BalanceCalculator> balanceCalculations;

    @Autowired
    public BalanceService(List<BalanceCalculator> balanceCalculations) {
        this.balanceCalculations = balanceCalculations;
    }

    public BalanceSummaryResponse getResults(PlantedCrop finalCrop, Player player) {
        int minimumBalance = balanceCalculations.get(0).calculateBalance(player, finalCrop);
        int potentialBalance = balanceCalculations.get(1).calculateBalance(player, finalCrop);
        return new BalanceSummaryResponse(player, finalCrop.getCrop(), minimumBalance, potentialBalance);
    }
}
