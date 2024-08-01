import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.Calculator;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void shouldTakeVariablesAndReturnMinimumBalance() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        int farmingLevel = 5;
//        When
        Calculator calc = new Calculator(balance, farmingLevel);
        double minimumBalance = calc.calculateMinimumBalance(seedCount, finalCrop);
//        Then
        assertThat(minimumBalance).isEqualTo(115);
    }

    @Test
    public void shouldTakeVariablesAndReturnPotentialBalance() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
//        When
        Calculator calc = new Calculator(balance, farmingLevel);
        calc.setProbabilities(farmingLevel);
        double potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(120.555);
    }

    @Test
    public void shouldTakeADoubleAndConvertToAnInt() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
        double farmingLevel = 5;
//        When
        Calculator calc = new Calculator(balance, farmingLevel);
        calc.setProbabilities(farmingLevel);
        int potentialBalance = calc.calculatePotentialBalance(seedCount, finalCrop);
//        Then
        assertThat(potentialBalance).isEqualTo(120);
    }


}
