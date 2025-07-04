package uk.co.stardewcalculator.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import uk.co.stardewcalculator.domain.season.Season;
import uk.co.stardewcalculator.domain.types.CropV2;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class CropRepositoryTest {

    @Autowired
    private CropRepository cropRepository;

    private CropV2 testCrop;

    @BeforeEach
    public void setUp() {
        // Initialize test data before each test method
        testCrop = new CropV2();
        testCrop.setCrop("Parsnip");
        testCrop.setCostPerSeedPierre(20);
        testCrop.setCostPerSeedJojo(25);
        testCrop.setBasicSellingPrice(35);
        testCrop.setSilverSellingPrice(43);
        testCrop.setGoldSellingPrice(52);
        testCrop.setIridiumSellingPrice(70);
        testCrop.setTimeToMaturity(4);
        testCrop.setTimeToRegrow(null);
        testCrop.setSeason(Season.SPRING);
    }

    @AfterEach
    public void tearDown() {
        // Release test data after each test method
        cropRepository.deleteAll();
    }

    @Test
    void givenCropString_whenFindCrop_thenReturnCrop() {
        CropV2 selectedCrop = cropRepository.getReferenceById(testCrop.getCrop());
        assertNotNull(selectedCrop);
        assertEquals(testCrop.getBasicSellingPrice(), selectedCrop.getBasicSellingPrice());

    }

}
