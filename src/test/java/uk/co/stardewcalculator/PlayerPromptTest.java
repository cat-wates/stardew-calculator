package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.farm.FarmPrompt;
import uk.co.stardewcalculator.player.PlayerPrompt;

import java.util.Scanner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerPromptTest {

    @Test
    public void shouldCheckSetBalanceMethodBehavesAsExpectedForAHappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("100");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        int balance = playerPrompt.setBalance();
//        Then
        assertThat(balance).isEqualTo(100);
    }

    @Test
    public void shouldCheckSetBalanceMethodBehavesAsExpectedForUnhappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("cat");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            playerPrompt.setBalance();
        }).withMessageMatching("For input string: \"cat\""); //use \ for quotes in a string!
    }

    @Test
    public void shouldCheckSetFarmingLevelMethodBehavesAsExpectedForAHappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("5");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        double farmingLevel = playerPrompt.setFarmingLevel();
//        Then
        assertThat(farmingLevel).isEqualTo(5.0);
    }

    @Test
    public void shouldCheckSetFarmingLevelMethodBehavesAsExpectedForAnUnhappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("cat");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            playerPrompt.setFarmingLevel();
        }).withMessageMatching("For input string: \"cat\"");
    }

    @Test
    public void shouldCheckSetTillerChoiceBehavesAsExpectedWhenUserIsTiller() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("y");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        double farmingLevel = 5;
        boolean isTiller = playerPrompt.setTillerChoice(farmingLevel);
//        Then
        assertThat(isTiller).isTrue();
    }

    @Test
    public void shouldCheckSetTillerChoiceBehavesAsExpectedWhenUserIsNotTiller() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("n");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        double farmingLevel = 5;
        boolean isTiller = playerPrompt.setTillerChoice(farmingLevel);
//        Then
        assertThat(isTiller).isFalse();
    }

    @Test
    public void shouldCheckSetAgriculturalistChoiceBehavesAsExpectedWhenUserIsAgriculturalist() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("y");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        double farmingLevel = 10;
        boolean isAgriculturalist = playerPrompt.setAgriculturalistChoice(farmingLevel);
//        Then
        assertThat(isAgriculturalist).isTrue();
    }

    @Test
    public void shouldCheckSetAgriculturalistChoiceBehavesAsExpectedWhenUserIsNotAgriculturalist() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("n");
//        When
        PlayerPrompt playerPrompt = new PlayerPrompt(sc);
        double farmingLevel = 10;
        boolean isAgriculturalist = playerPrompt.setAgriculturalistChoice(farmingLevel);
//        Then
        assertThat(isAgriculturalist).isFalse();
    }

    @Test
    public void shouldCheckSetSeedCountMethodBehavesAsExpectedForAHappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("100");
//        When
        FarmPrompt farmPrompt = new FarmPrompt(sc);
        int seedCount = farmPrompt.setSeedCount();
//        Then
        assertThat(seedCount).isEqualTo(100);
    }

    @Test
    public void shouldCheckSetSeedCountMethodBehavesAsExpectedForAnUnhappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("cat");
//        When
        FarmPrompt farmPrompt = new FarmPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            farmPrompt.setSeedCount();
        }).withMessageMatching("For input string: \"cat\"");
    }

    @Test
    public void shouldCheckSetFertilizerLevelMethodBehavesAsExpectedForAHappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("0");
//        When
        FarmPrompt farmPrompt = new FarmPrompt(sc);
        int seedCount = farmPrompt.setFertilizerLevel();
//        Then
        assertThat(seedCount).isEqualTo(0);
    }

    @Test
    public void shouldCheckSetFertilizerLevelMethodBehavesAsExpectedForAnUnhappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("cat");
//        When
        FarmPrompt farmPrompt = new FarmPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            farmPrompt.setFertilizerLevel();
        }).withMessageMatching("For input string: \"cat\"");
    }
}
