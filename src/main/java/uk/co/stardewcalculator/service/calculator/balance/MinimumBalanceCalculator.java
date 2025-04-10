package uk.co.stardewcalculator.service.calculator.balance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.calculator.CostCalculator;
import uk.co.stardewcalculator.service.calculator.MultiplierCalculator;

import static uk.co.stardewcalculator.domain.types.Quality.BASIC;

@Component
public class MinimumBalanceCalculator  implements BalanceCalculator {

    MultiplierCalculator multiplierCalculator;
    CostCalculator costCalculator;

    @Autowired
    public MinimumBalanceCalculator(MultiplierCalculator multiplierCalculator, CostCalculator costCalculator ) {
        this.multiplierCalculator = multiplierCalculator;
        this.costCalculator = costCalculator;
    }

    @Override
    public int calculateBalance(Player player, PlantedCrop finalCrop) {
        double minimumBalance = costCalculator.calculateBalanceMinusCost(player.getBalance(), finalCrop, player.getFarm().getSeedCount())
                + (finalCrop.getSellingPrice(BASIC) * multiplierCalculator.calculateMultipliers(player.getTiller(), finalCrop.getCrop()));
        return (int)minimumBalance;
    }
}
