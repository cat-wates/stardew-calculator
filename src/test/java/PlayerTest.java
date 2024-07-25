import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.Player;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void shouldNotAssignProfessionsBasedOnFarmingLevelInput() {
//        Given
        int farmingLevel = 0;
//        When
        Player player = new Player(farmingLevel);
        player.defineProfessions(farmingLevel);
//        Then
        assertFalse(player.isTiller);
        assertFalse(player.isAgriculturist);
        assertEquals(player.farmingLevel, 0);
    }

//    @Test
//    public void shouldAssignOneProfessionBasedOnFarmingLevelInput() {
////        Given
//        int farmingLevel = 6;
////        When
//        Player player = new Player(farmingLevel);
//        player.defineProfessions(farmingLevel);
////        Then
//        assertTrue(player.isTiller);
//        assertFalse(player.isAgriculturist);
//        assertEquals(player.farmingLevel, 6);
//    }
}


