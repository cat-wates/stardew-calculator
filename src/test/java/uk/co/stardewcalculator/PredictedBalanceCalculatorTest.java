package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.service.PredictedBalanceCalculator;
import uk.co.stardewcalculator.service.CropProfit;
import uk.co.stardewcalculator.service.CropQuality;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.CoffeeBean;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class PredictedBalanceCalculatorTest {

    Farm farm = new Farm(0, 1);
    Player playerWithoutTiller = new Player("tangykitkat", 5, 100, false, false, farm);
    Player playerWithTiller = new Player("tangykitkat", 5, 100, true, false, farm);

    //min balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double minimumBalance = calc.calculateMinimumBalance(playerWithoutTiller.getTiller(), playerWithoutTiller.getBalance(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(minimumBalance).isEqualTo(205);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double minimumBalance = calc.calculateMinimumBalance(playerWithTiller.getTiller(), playerWithTiller.getBalance(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(minimumBalance).isEqualTo(229);
    }

    //min balance reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean();
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double minimumBalance = calc.calculateMinimumBalance(playerWithoutTiller.getTiller(), playerWithoutTiller.getBalance(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(minimumBalance).isEqualTo(-2250);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double minimumBalance = calc.calculateMinimumBalance(playerWithTiller.getTiller(), playerWithTiller.getBalance(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(minimumBalance).isEqualTo(-2235);
    }

    //potential balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double potentialBalance = calc.calculatePotentialBalance(playerWithoutTiller.getTiller(), playerWithoutTiller.getBalance(), playerWithoutTiller.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(potentialBalance).isEqualTo(285);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double potentialBalance = calc.calculatePotentialBalance(playerWithTiller.getTiller(), playerWithTiller.getBalance(), playerWithTiller.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(potentialBalance).isEqualTo(317);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double potentialBalance = calc.calculatePotentialBalance(playerWithoutTiller.getTiller(), playerWithoutTiller.getBalance(), playerWithoutTiller.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(potentialBalance).isEqualTo(-2203);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //growth rate = 4
        CropQuality cropQuality = new CropQuality();
        CropProfit cropProfit = new CropProfit(cropQuality);
//        When
        PredictedBalanceCalculator calc = new PredictedBalanceCalculator(cropProfit);
        double potentialBalance = calc.calculatePotentialBalance(playerWithTiller.getTiller(), playerWithTiller.getBalance(), playerWithTiller.getFarmingLevel(), farm.getFertilizerLevel(), finalCrop, farm.getSeedCount());
//        Then
        assertThat(potentialBalance).isEqualTo(-2183);
    }
}
