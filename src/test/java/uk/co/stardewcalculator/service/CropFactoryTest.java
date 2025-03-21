package uk.co.stardewcalculator.service;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.domain.types.Crop;
import uk.co.stardewcalculator.domain.season.spring.Parsnip;

import java.util.Optional;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CropFactoryTest {

    @Test
    public void shouldAssignCropBasedOnUserInputForAHappyPath() {
//        Given
        String cropType = "parsnip";
//        When
        Optional<Crop> finalCrop = CropFactory.assignCrop(cropType);
//        Then
        assertThat(finalCrop.get()).isInstanceOf(Parsnip.class);
    }

    @Test
    public void shouldAssignCropBasedOnUserInputForAnUnhappyPath() {
//        Given
        String cropType = "cat";
//        When
        Optional<Crop> finalCrop = CropFactory.assignCrop(cropType);
//        Then
        assertThat(finalCrop.isEmpty()).isTrue();
    }
}
