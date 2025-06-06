package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class CropQualityTest {

    @Test
    public void shouldReassignInstanceVariablesWithCorrectProbabilities() {
//        Given
        int farmingLevel = 0;
        int fertilizerLevel = 1;
//        When
        CropQuality cq = new CropQuality();
//        Then
        assertThat(cq.getBasicProbability(farmingLevel, fertilizerLevel)).isEqualTo(0.8483333333333334);
        assertThat(cq.getSilverProbability(farmingLevel, fertilizerLevel)).isEqualTo(0.08666666666666667);
        assertThat(cq.getGoldProbability(farmingLevel, fertilizerLevel)).isEqualTo(0.043333333333333335);
        assertThat(cq.getIridiumProbability(farmingLevel, fertilizerLevel)).isEqualTo(0.021666666666666667);
    }


}