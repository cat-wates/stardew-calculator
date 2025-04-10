package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uk.co.stardewcalculator.controller.BalanceSummaryResponse;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.types.PlantedCrop;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class BalanceServiceTest {

    @Autowired
    BalanceService balanceService;

    Player player = new Player("tangykitkat", 5, 100, false, false, new Farm(1, 1));
    Crop crop = new Parsnip();

    @Test
    void shouldReturnMinimumBalanceFromBalanceSummaryResponse() {
        //Given
        PlantedCrop finalCrop = new PlantedCrop(crop, player.getFarm().getSeedCount(), player.getFarm().getFertilizerLevel());
        //When
        BalanceSummaryResponse balanceSummaryResponse = balanceService.getResults(finalCrop, player);
        //Then
        assertThat(balanceSummaryResponse.getMinimumBalance()).isEqualTo(205);
    }

    @Test
    void shouldReturnPotentialBalanceFromBalanceSummaryResponse() {
        //Given
        PlantedCrop finalCrop = new PlantedCrop(crop, player.getFarm().getSeedCount(), player.getFarm().getFertilizerLevel());
        //When
        BalanceSummaryResponse balanceSummaryResponse = balanceService.getResults(finalCrop, player);
        //Then
        assertThat(balanceSummaryResponse.getPotentialBalance()).isEqualTo(285);
    }
}
