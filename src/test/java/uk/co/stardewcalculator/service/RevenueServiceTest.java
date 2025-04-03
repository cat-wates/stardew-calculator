package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

import static org.assertj.core.api.Assertions.assertThat;


class RevenueServiceTest {

    @Test
    public void shouldCalculatePotentialProfitFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        PlantedCrop finalCrop = new PlantedCrop(crop, seedCount, fertilizerLevel);
        CropQuality cq = new CropQuality();
//        When
        RevenueService cp = new RevenueService(cq);
//        Then
        assertThat(cp.getPotentialBasicRevenue(farmingLevel, finalCrop)).isEqualTo(29.69166666666667);
        assertThat(cp.getPotentialSilverRevenue(farmingLevel, finalCrop)).isEqualTo(3.7266666666666666);
        assertThat(cp.getPotentialGoldRevenue(farmingLevel, finalCrop)).isEqualTo(2.2533333333333334);
        assertThat(cp.getPotentialIridiumRevenue(farmingLevel, finalCrop)).isEqualTo(1.51666666666666663);
    }

}