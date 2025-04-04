package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.revenue.*;

import static org.assertj.core.api.Assertions.assertThat;

public class RevenueCalculatorTest {

    @Test
    public void shouldReturnBasicRevenue() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        PlantedCrop finalCrop = new PlantedCrop(crop, seedCount, fertilizerLevel);
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator basicRevenueCalculator = new BasicRevenueCalculator();
//        Then
        assertThat(basicRevenueCalculator.calculateRevenue(farmingLevel, finalCrop, cq)).isEqualTo(29.69166666666667);
    }

    @Test
    public void shouldReturnSilverRevenue() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        PlantedCrop finalCrop = new PlantedCrop(crop, seedCount, fertilizerLevel);
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator silverRevenueCalculator = new SilverRevenueCalculator();
//        Then
        assertThat(silverRevenueCalculator.calculateRevenue(farmingLevel, finalCrop, cq)).isEqualTo(3.7266666666666666);
    }

    @Test
    public void shouldReturnGoldRevenue() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        PlantedCrop finalCrop = new PlantedCrop(crop, seedCount, fertilizerLevel);
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator goldRevenueCalculator = new GoldRevenueCalculator();
//        Then
        assertThat(goldRevenueCalculator.calculateRevenue(farmingLevel, finalCrop, cq)).isEqualTo(2.2533333333333334);
    }

    @Test
    public void shouldReturnIridiumRevenue() {
//        Given
        Crop crop = new Parsnip();
        int farmingLevel = 0;
        int fertilizerLevel = 1;
        int seedCount = 1;
        PlantedCrop finalCrop = new PlantedCrop(crop, seedCount, fertilizerLevel);
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator iridiumRevenueCalculator = new IridiumRevenueCalculator();
//        Then
        assertThat(iridiumRevenueCalculator.calculateRevenue(farmingLevel, finalCrop, cq)).isEqualTo(1.51666666666666663);
    }
}
