import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("case 28/2/2020")
    public void testNextday2020Feb28() {
        int day = 28;
        int month = 2;
        int year = 2020;

        int[] expectedResult = {29, 2, 2020};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 31/12/2020")
    public void testNextday2020Dec31() {
        int day = 31;
        int month = 12;
        int year = 2020;

        int[] expectedResult = {1, 1, 2021};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 28/2/2021")
    public void testNextday2021Feb28() {
        int day = 28;
        int month = 2;
        int year = 2021;

        int[] expectedResult = {1, 3, 2021};
        assertArrayEquals(expectedResult, NextDayCalculator.getNextDay(day, month, year));
    }

    @Test
    @DisplayName("case 30/8/2020")
    public void testNextday2020Aug30() {
        int day = 30;
        int month = 8;
        int year = 2020;

        int[] expectedResult = {31, 8, 2020};
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
