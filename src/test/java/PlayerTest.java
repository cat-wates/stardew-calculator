import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.Player;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class PlayerTest {

    @Test
    public void shouldNotAssignProfessionsBasedOnFarmingLevelInput() {
//        Given
        double farmingLevel = 0;
        int balance = 100;
//        When
        Player player = new Player(farmingLevel, balance);
        player.defineProfessions(farmingLevel);
//        Then
        assertThat(player.isTiller).isFalse();
        assertThat(player.isAgriculturist).isFalse();
        assertThat(player.farmingLevel).isEqualTo(0);
    }

//    @Test
//    public void shouldAssignOneProfessionBasedOnFarmingLevelInput() {
////        Given
//        double farmingLevel = 6;
//        int balance = 100;
////        When
//        Player player = new Player(farmingLevel, balance);
//        player.defineProfessions(farmingLevel);
////        Then
//        assertThat(player.isTiller).isTrue();
//        assertThat(player.isAgriculturist).isFalse();
//        assertThat(player.farmingLevel).isEqualTo(6);
//    }
}


