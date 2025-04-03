package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;

import static org.assertj.core.api.Assertions.assertThat;


class RevenueServiceTest {

    @Test
    public void shouldCalculateMinimumProfitAndCostFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int seedCount = 1;
        CropQuality cq = new CropQuality();
//        When
        RevenueService cp = new RevenueService(cq);
//        Then
        assertThat(cp.getCost(crop, seedCount)).isEqualTo(20);
        assertThat(cp.getMinimumBasicRevenue(crop, seedCount)).isEqualTo(35);
    }

    @Test
    public void shouldCalculatePotentialProfitFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        CropQuality cq = new CropQuality();
//        When
        RevenueService cp = new RevenueService(cq);
//        Then
        assertThat(cp.getPotentialBasicRevenue(farmingLevel, fertilizerLevel, crop, seedCount)).isEqualTo(29.69166666666667);
        assertThat(cp.getPotentialSilverRevenue(farmingLevel, fertilizerLevel, crop, seedCount)).isEqualTo(3.7266666666666666);
        assertThat(cp.getPotentialGoldRevenue(farmingLevel, fertilizerLevel, crop, seedCount)).isEqualTo(2.2533333333333334);
        assertThat(cp.getPotentialIridiumRevenue(farmingLevel, fertilizerLevel, crop, seedCount)).isEqualTo(1.51666666666666663);
    }

}