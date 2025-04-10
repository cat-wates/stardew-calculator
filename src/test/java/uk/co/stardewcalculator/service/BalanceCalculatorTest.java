package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.CoffeeBean;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.balance.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BalanceCalculatorTest {

    @Autowired
    PotentialBalanceCalculator potentialBalanceCalculator;
    @Autowired
    MinimumBalanceCalculator minimumBalanceCalculator;

    Farm farm = new Farm(1, 1);
    Player playerWithoutTiller = new Player("tangykitkat", 5, 100, false, false, farm);
    Player playerWithTiller = new Player("tangykitkat", 5, 100, true, false, farm);
    Crop nonReproducingCrop = new Parsnip();
    Crop reproducingCrop = new CoffeeBean();

    //min balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForNonReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(nonReproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double minimumBalance = minimumBalanceCalculator.calculateBalance(playerWithoutTiller, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(205);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(nonReproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double minimumBalance = minimumBalanceCalculator.calculateBalance(playerWithTiller, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(229);
    }

    //min balance reproducing
    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceForReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(reproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double minimumBalance = minimumBalanceCalculator.calculateBalance(playerWithoutTiller, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(-2250);
    }

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(reproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double minimumBalance = minimumBalanceCalculator.calculateBalance(playerWithTiller, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(-2235);
    }

    //potential balance non-reproducing
    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceForNonReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(nonReproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double potentialBalance = potentialBalanceCalculator.calculateBalance(playerWithoutTiller, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(285);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariableForNonReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(nonReproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double potentialBalance = potentialBalanceCalculator.calculateBalance(playerWithTiller, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(317);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceForReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(reproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double potentialBalance = potentialBalanceCalculator.calculateBalance(playerWithoutTiller, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(-2203);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalanceIncludingTillerVariableForReproducingPlant() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(reproducingCrop, farm.getSeedCount(), farm.getFertilizerLevel());
//        When
        double potentialBalance = potentialBalanceCalculator.calculateBalance(playerWithTiller, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(-2183);
    }
}
