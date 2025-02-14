package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.service.CropProfit;
import uk.co.stardewcalculator.service.CropQuality;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;

import static org.assertj.core.api.Java6Assertions.assertThat;

class CropProfitTest {

    @Test
    public void shouldCalculateMinimumProfitAndCostFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        CropQuality cq = new CropQuality(farmingLevel, fertilizerLevel);
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
        int fertilizerLevel = 1;
        int seedCount = 1;
        CropQuality cq = new CropQuality(farmingLevel, fertilizerLevel);
//        When
        CropProfit cp = new CropProfit(cq, crop, seedCount);
//        Then
        assertThat(cp.getPotentialBasicProfit()).isEqualTo(29.69166666666667);
        assertThat(cp.getPotentialSilverProfit()).isEqualTo(3.7266666666666666);
        assertThat(cp.getPotentialGoldProfit()).isEqualTo(2.2533333333333334);
        assertThat(cp.getPotentialIridiumProfit()).isEqualTo(1.51666666666666663);
    }

}