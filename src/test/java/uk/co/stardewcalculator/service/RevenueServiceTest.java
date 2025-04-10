package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RevenueServiceTest {

    @Autowired
    private RevenueService revenueService;

    @Test
    public void shouldCalculatePotentialTotalProfitFromQualityAndSeedCountForAGivenCrop() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        PlantedCrop finalCrop = new PlantedCrop(crop, seedCount, fertilizerLevel);
//        When
//        Then
        assertThat(revenueService.getTotalRevenue(farmingLevel, finalCrop)).isEqualTo(37.18833333333334);
    }

}