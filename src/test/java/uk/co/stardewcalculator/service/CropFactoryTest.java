package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uk.co.stardewcalculator.domain.types.Crop;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CropFactoryTest {

    @Autowired
    private CropFactory cropFactory;

    @Test
    public void shouldAssignCropBasedOnUserInputForAHappyPath() {
//        Given
        String cropType = "parsnip";
//        When
        Optional<Crop> finalCrop = cropFactory.assignCrop(cropType);
//        Then
        assertThat(finalCrop.get().getCrop()).isEqualTo(cropType);
    }

    @Test
    public void shouldAssignCropBasedOnUserInputForAnUnhappyPath() {
//        Given
        String cropType = "cat";
//        When
        Optional<Crop> finalCrop = cropFactory.assignCrop(cropType);
//        Then
        assertThat(finalCrop.isEmpty()).isTrue();
    }
}
