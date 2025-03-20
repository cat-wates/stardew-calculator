package uk.co.stardewcalculator.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import uk.co.stardewcalculator.domain.Farm;
import uk.co.stardewcalculator.domain.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class PlayerRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    private Player testPlayer;

    @BeforeEach
    public void setUp() {
        // Initialize test data before each test method
        testPlayer = new Player();
        testPlayer.setAgriculturist(false);
        testPlayer.setBalance(1000);
        testPlayer.setFarm(new Farm());
        testPlayer.setFarmingLevel(1);
        testPlayer.setTiller(false);
        testPlayer.setUsername("test-cat");
        playerRepository.save(testPlayer);
    }

    @AfterEach
    public void tearDown() {
        // Release test data after each test method
        playerRepository.deleteAll();
    }

    @Test
    void givenPlayer_whenFindPlayers_thenReturnPlayer() {
        Player savedPlayer = playerRepository.getReferenceById(testPlayer.getId());
        assertNotNull(savedPlayer);
        assertEquals(testPlayer.getUsername(), savedPlayer.getUsername());
    }


}
