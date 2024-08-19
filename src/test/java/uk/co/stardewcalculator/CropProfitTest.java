package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import static org.assertj.core.api.Java6Assertions.assertThat;

class CropProfitTest {

    @Test
    public void shouldCalculateMinimumProfitAndCostFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int seedCount = 1;
        CropQuality cq = new CropQuality(farmingLevel);
        cq.setProbabilities();
//        When
        CropProfit cp = new CropProfit(cq, crop, seedCount);
//        Then
        assertThat(cp.setCost()).isEqualTo(20);
        assertThat(cp.setMinimumBasicProfit()).isEqualTo(35);
    }

    @Test
    public void shouldCalculatePotentialProfitFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int seedCount = 1;
        CropQuality cq = new CropQuality(farmingLevel);
        cq.setProbabilities();
//        When
        CropProfit cp = new CropProfit(cq, crop, seedCount);
//        Then
        assertThat(cp.setPotentialBasicProfit()).isEqualTo(33.775);
        assertThat(cp.setPotentialSilverProfit()).isEqualTo(0.86);
        assertThat(cp.setPotentialGoldProfit()).isEqualTo(0.52);
//        assertThat(cp.setPotentialIridiumProfit()).isEqualTo(0.35);
    }
}