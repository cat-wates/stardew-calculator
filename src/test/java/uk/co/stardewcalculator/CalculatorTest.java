package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.CoffeeBean;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    //min balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip(); //growth rate = 4
        int balance = 100;
        int seedCount = 1;
        int farmingLevel = 5;
        boolean isTiller = false;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        double minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(205);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
        boolean isTiller = true;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        calc.setProbabilities(farmingLevel);
        double minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(229);
    }

    //min balance reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean(); //maturity = 10, regrow = 2
        int balance = 100;
        int seedCount = 1;
        int farmingLevel = 5;
        boolean isTiller = false;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        double minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(-2250);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        Crop finalCrop = new CoffeeBean();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
        boolean isTiller = true;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        calc.setProbabilities(farmingLevel);
        double minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(-2235);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalance() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
        boolean isTiller = false;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        calc.setProbabilities(farmingLevel);
        double potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(120.555);
    }

    @Test
    public void shouldTakeADoubleAndConvertToAnInt() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
        boolean isTiller = false;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        calc.setProbabilities(farmingLevel);
        int potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(120);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariable() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
        boolean isTiller = true;
//        When
        Calculator calc = new Calculator(balance, farmingLevel, isTiller);
        calc.setProbabilities(farmingLevel);
        double potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(124);
    }


}
