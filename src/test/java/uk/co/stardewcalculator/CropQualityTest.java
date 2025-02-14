package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.service.CropQuality;

import static org.assertj.core.api.Java6Assertions.assertThat;

class CropQualityTest {

    @Test
    public void shouldReassignInstanceVariablesWithCorrectProbabilities() {
//        Given
        int farmingLevel = 0;
        int fertilizerLevel = 1;
//        When
        CropQuality cq = new CropQuality(farmingLevel, fertilizerLevel);
//        Then
        assertThat(cq.getBasicProbability()).isEqualTo(0.8483333333333334);
        assertThat(cq.getSilverProbability()).isEqualTo(0.08666666666666667);
        assertThat(cq.getGoldProbability()).isEqualTo(0.043333333333333335);
        assertThat(cq.getIridiumProbability()).isEqualTo(0.021666666666666667);
    }


}