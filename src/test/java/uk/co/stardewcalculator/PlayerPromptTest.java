package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PlayerPromptTest {

    @Test
    public void shouldCheckSetBalanceMethodBehavesAsExpected() {
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
    public void shouldCheckSetFarmingLevelMethodBehavesAsExpected() {
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
    public void shouldCheckSetSeedCountMethodBehavesAsExpected() {
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

//    @Test
//    public void shouldCheckSetCropAndCalculateStatsMethodBehavesAsExpected() {
////        Given
//        Scanner sc = mock(Scanner.class);
//        assertNotNull(sc);
//        when(sc.nextLine()).thenReturn("parsnip");
////        When
//        PlayerPrompt pp = new PlayerPrompt(sc);
////        Then
//        assertThat(pp.).isEqualTo(100);
//    }
}
