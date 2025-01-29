package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.crop.CropProfit;
import uk.co.stardewcalculator.crop.CropQuality;
import uk.co.stardewcalculator.crop.types.Crop;
import uk.co.stardewcalculator.crop.season.spring.CoffeeBean;
import uk.co.stardewcalculator.crop.season.spring.Parsnip;
import uk.co.stardewcalculator.player.Player;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    //min balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, false, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double minimumBalance = calc.calculateMinimumBalance();
//        Then
        assertThat(minimumBalance).isEqualTo(205);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, true, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double minimumBalance = calc.calculateMinimumBalance();
//        Then
        assertThat(minimumBalance).isEqualTo(229);
    }

    //min balance reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean();
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, false, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double minimumBalance = calc.calculateMinimumBalance();
//        Then
        assertThat(minimumBalance).isEqualTo(-2250);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, true, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double minimumBalance = calc.calculateMinimumBalance();
//        Then
        assertThat(minimumBalance).isEqualTo(-2235);
    }

    //potential balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, false, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double potentialBalance = calc.calculatePotentialBalance();
//        Then
        assertThat(potentialBalance).isEqualTo(285);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, true, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double potentialBalance = calc.calculatePotentialBalance();
//        Then
        assertThat(potentialBalance).isEqualTo(317);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, false, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double potentialBalance = calc.calculatePotentialBalance();
//        Then
        assertThat(potentialBalance).isEqualTo(-2203);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //growth rate = 4
        int fertilizerLevel = 1;
        int seedCount = 1;
        Player player = new Player(5, 100, true, false);
        CropQuality cropQuality = new CropQuality(player.getFarmingLevel(), fertilizerLevel);
        CropProfit cropProfit = new CropProfit(cropQuality, finalCrop, seedCount);
//        When
        Calculator calc = new Calculator(player, finalCrop, cropProfit);
        double potentialBalance = calc.calculatePotentialBalance();
//        Then
        assertThat(potentialBalance).isEqualTo(-2183);
    }
}
