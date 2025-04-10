package uk.co.stardewcalculator.service.balance;

import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

public interface BalanceCalculator {

    int calculateBalance(Player player, PlantedCrop finalCrop);
}
