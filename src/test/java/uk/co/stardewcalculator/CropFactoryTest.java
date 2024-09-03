package uk.co.stardewcalculator;

import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class CropFactoryTest {

    @Test
    public void shouldAssignCropBasedOnUserInputForAHappyPath() {
//        Given
        String cropType = "parsnip";
//        When
        Crop finalCrop = CropFactory.assignCrop(cropType);
//        Then
        assertThat(finalCrop).isInstanceOf(Parsnip.class);
    }

    @Test
    public void shouldAssignCropBasedOnUserInputForAnUnhappyPath() {
//        Given
        String cropType = "cat";
//        When
//        Then
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            CropFactory.assignCrop(cropType);
        }).withMessageMatching("Crop not found! Start again.");
    }
}
