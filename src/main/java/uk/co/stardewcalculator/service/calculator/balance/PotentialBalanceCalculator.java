package uk.co.stardewcalculator.service.calculator.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.calculator.CostCalculator;
import uk.co.stardewcalculator.service.calculator.MultiplierCalculator;
import uk.co.stardewcalculator.service.RevenueService;

@Component
public class PotentialBalanceCalculator  implements BalanceCalculator {

    RevenueService revenueService;
    CostCalculator costCalculator;
    MultiplierCalculator multiplierCalculator;

    @Autowired
    public PotentialBalanceCalculator(RevenueService revenueService, CostCalculator costCalculator, MultiplierCalculator multiplierCalculator) {
        this.revenueService = revenueService;
        this.costCalculator = costCalculator;
        this.multiplierCalculator = multiplierCalculator;
    }

    @Override
    public int calculateBalance(Player player, PlantedCrop finalCrop) {
        double totalProfit = revenueService.getTotalRevenue(player.getFarmingLevel(), finalCrop);
        double potentialBalance = costCalculator.calculateBalanceMinusCost(player.getBalance(), finalCrop, player.getFarm().getSeedCount())
                + (totalProfit * multiplierCalculator.calculateMultipliers(player.getTiller(), finalCrop.getCrop()));
        return (int)potentialBalance; //rounds down
    }
}
