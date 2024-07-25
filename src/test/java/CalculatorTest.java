import org.junit.jupiter.api.Test;
import uk.co.stardewcalculator.Calculator;
import uk.co.stardewcalculator.crop.Crop;
import uk.co.stardewcalculator.crop.spring.Parsnip;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldTakeVariablesAndReturnNewBalance() {
//        Given
        Crop finalCrop = new Parsnip();
        int balance = 100;
        int seedCount = 1;
//        When
        Calculator calc = new Calculator(balance);
        int newBalance = calc.calculateNewBalance(seedCount, finalCrop);
//        Then
        assertEquals(newBalance, 115);
    }
}
