package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
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
