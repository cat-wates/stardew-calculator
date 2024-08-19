package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class CropQualityTest {

    @Test
    public void shouldReassignInstanceVariablesWithCorrectProbabilities() {
//        Given
        int farmingLevel = 0;
        CropQuality cq = new CropQuality(farmingLevel);
//        When
        cq.setProbabilities();
//        Then
        assertThat(cq.getBasicProbability()).isEqualTo(0.965);
        assertThat(cq.getSilverProbability()).isEqualTo(0.02);
        assertThat(cq.getGoldProbability()).isEqualTo(0.01);
        assertThat(cq.getIridiumProbability()).isEqualTo(0.005);
    }


}