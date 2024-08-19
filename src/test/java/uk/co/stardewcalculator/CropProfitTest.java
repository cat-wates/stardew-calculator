package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.Java6Assertions.assertThat;

class CropProfitTest {

    @Test
    public void shouldCalculateMinimumProfitAndCostFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int seedCount = 1;
        CropQuality cq = new CropQuality(farmingLevel);
//        When
        CropProfit cp = new CropProfit(cq, crop, seedCount);
//        Then
        assertThat(cp.getCost()).isEqualTo(20);
        assertThat(cp.getMinimumBasicProfit()).isEqualTo(35);
    }

    @Test
    public void shouldCalculatePotentialProfitFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int seedCount = 1;
        CropQuality cq = new CropQuality(farmingLevel);
//        When
        CropProfit cp = new CropProfit(cq, crop, seedCount);
//        Then
        assertThat(cp.getPotentialBasicProfit()).isEqualTo(33.775);
        assertThat(cp.getPotentialSilverProfit()).isEqualTo(0.86);
        assertThat(cp.getPotentialGoldProfit()).isEqualTo(0.52);
        assertThat(BigDecimal.valueOf(cp.getPotentialIridiumProfit()).setScale(2, RoundingMode.FLOOR).equals((BigDecimal.valueOf(0.35))));
    }

}