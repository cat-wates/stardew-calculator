package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;

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
        PlayerPrompt pp = new PlayerPrompt(sc);
        int balance = pp.setBalance();
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
        PlayerPrompt pp = new PlayerPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            pp.setBalance();
        }).withMessageMatching("For input string: \"cat\""); //use \ for quotes in a string!
    }

    @Test
    public void shouldCheckSetFarmingLevelMethodBehavesAsExpectedForAHappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("5");
//        When
        PlayerPrompt pp = new PlayerPrompt(sc);
        double farmingLevel = pp.setFarmingLevel();
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
        PlayerPrompt pp = new PlayerPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            pp.setFarmingLevel();
        }).withMessageMatching("For input string: \"cat\"");
    }

    @Test
    public void shouldCheckSetTillerChoiceBehavesAsExpectedWhenUserIsTiller() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("y");
//        When
        PlayerPrompt pp = new PlayerPrompt(sc);
        double farmingLevel = 5;
        boolean isTiller = pp.setTillerChoice(farmingLevel);
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
        PlayerPrompt pp = new PlayerPrompt(sc);
        double farmingLevel = 5;
        boolean isTiller = pp.setTillerChoice(farmingLevel);
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
        PlayerPrompt pp = new PlayerPrompt(sc);
        double farmingLevel = 10;
        boolean isAgriculturalist = pp.setAgriculturalistChoice(farmingLevel);
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
        PlayerPrompt pp = new PlayerPrompt(sc);
        double farmingLevel = 10;
        boolean isAgriculturalist = pp.setAgriculturalistChoice(farmingLevel);
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
        PlayerPrompt pp = new PlayerPrompt(sc);
        int seedCount = pp.setSeedCount();
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
        PlayerPrompt pp = new PlayerPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            pp.setSeedCount();
        }).withMessageMatching("For input string: \"cat\"");
    }

    @Test
    public void shouldCheckSetFertilizerLevelMethodBehavesAsExpectedForAHappyPath() {
//        Given
        Scanner sc = mock(Scanner.class);
        assertNotNull(sc);
        when(sc.nextLine()).thenReturn("0");
//        When
        PlayerPrompt pp = new PlayerPrompt(sc);
        int seedCount = pp.setFertilizerLevel();
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
        PlayerPrompt pp = new PlayerPrompt(sc);
//        Then
        assertThatExceptionOfType(NumberFormatException.class).isThrownBy(() -> {
            pp.setFertilizerLevel();
        }).withMessageMatching("For input string: \"cat\"");
    }
}
