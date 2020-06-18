
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("case negative")
    public void testCaseNegative() {
        double number = -1;
        double expectedResult = 1;
        assertEquals(expectedResult, AbsoluteNumberCalculator.absoluteNumberCalculate(number));
    }

    @Test
    @DisplayName("case positive")
    public void testCasePositive() {
        double number = 1;
        double expectedResult = 1;
        assertEquals(expectedResult, AbsoluteNumberCalculator.absoluteNumberCalculate(number));
    }

    @Test
    @DisplayName("case zero")
    public void testCaseZero() {
        double number = 0;
        double expectedResult = 0;
        assertEquals(expectedResult, AbsoluteNumberCalculator.absoluteNumberCalculate(number));
    }
}
