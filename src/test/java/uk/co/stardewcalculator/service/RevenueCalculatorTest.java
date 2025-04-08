package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;
import uk.co.stardewcalculator.service.revenue.*;

import static org.assertj.core.api.Assertions.assertThat;

public class RevenueCalculatorTest {

    Crop crop = new Parsnip();
    Player player = new Player("tangykitkat", 0, 0, false, false, new Farm(1, 1));

    @Test
    public void shouldReturnBasicRevenue() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(crop, player.getFarm().getSeedCount(), player.getFarm().getFertilizerLevel());
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator basicRevenueCalculator = new BasicRevenueCalculator();
//        Then
        assertThat(basicRevenueCalculator.calculateRevenue(player.getFarmingLevel(), finalCrop, cq)).isEqualTo(29.69166666666667);
    }

    @Test
    public void shouldReturnSilverRevenue() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(crop, player.getFarm().getSeedCount(), player.getFarm().getFertilizerLevel());
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator silverRevenueCalculator = new SilverRevenueCalculator();
//        Then
        assertThat(silverRevenueCalculator.calculateRevenue(player.getFarmingLevel(), finalCrop, cq)).isEqualTo(3.7266666666666666);
    }

    @Test
    public void shouldReturnGoldRevenue() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(crop, player.getFarm().getSeedCount(), player.getFarm().getFertilizerLevel());
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator goldRevenueCalculator = new GoldRevenueCalculator();
//        Then
        assertThat(goldRevenueCalculator.calculateRevenue(player.getFarmingLevel(), finalCrop, cq)).isEqualTo(2.2533333333333334);
    }

    @Test
    public void shouldReturnIridiumRevenue() {
//        Given
        PlantedCrop finalCrop = new PlantedCrop(crop, player.getFarm().getSeedCount(), player.getFarm().getFertilizerLevel());
        CropQuality cq = new CropQuality();
//        When
        RevenueCalculator iridiumRevenueCalculator = new IridiumRevenueCalculator();
//        Then
        assertThat(iridiumRevenueCalculator.calculateRevenue(player.getFarmingLevel(), finalCrop, cq)).isEqualTo(1.51666666666666663);
    }
}
