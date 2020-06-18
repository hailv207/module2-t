import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("case 1/1/2018")
    public void testNextday2018Jan1() {
        int day = 1;
        int month = 1;
        int year = 2018;

        int[] expectedResult = {2, 1, 2018};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 31/1/2018")
    public void testNextday2018Jan31() {
        int day = 31;
        int month = 1;
        int year = 2018;

        int[] expectedResult = {1,2 , 2018};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 30/4/2018")
    public void testNextday2018Apr30() {
        int day = 30;
        int month = 4;
        int year = 2018;

        int[] expectedResult = {1, 5, 2018};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 28/2/2018")
    public void testNextday2018Feb28() {
        int day = 28;
        int month = 2;
        int year = 2018;

        int[] expectedResult = {1, 3, 2018};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 29/2/2020")
    public void testNextday2020Feb29() {
        int day = 29;
        int month = 2;
        int year = 2020;

        int[] expectedResult = {1, 3, 2020};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case invalid date")
    public void testNextdayInvalidDate() {
        int day = 1;
        int month = -1;
        int year = 2020;
        try {
            NextDayCalculator.getNextDay(day, month, year);
        } catch (InputMismatchException e) {
            assertTrue(e instanceof InputMismatchException);
        }
    }

}
