import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    @DisplayName("case divisible 3")
    public void testCaseDivisible3(){
        int number = 3;
        String expectedResult = "Fizz";
        assertEquals(expectedResult,FizzBuzz.returnFizzBuzz(number));
    }

    @Test
    @DisplayName("case divisible 5")
    public void testCaseDivisible5(){
        int number = 5;
        String expectedResult = "Buzz";
        assertEquals(expectedResult,FizzBuzz.returnFizzBuzz(number));
    }

    @Test
    @DisplayName("case divisible 3,5")
    public void testCaseDivisible35(){
        int number = 15;
        String expectedResult = "FizzBuzz";
        assertEquals(expectedResult,FizzBuzz.returnFizzBuzz(number));
    }
    @Test
    @DisplayName("case contain 3")
    public void testCaseContain3(){
        int number = 239;
        String expectedResult = "2Fizz9";
        assertEquals(expectedResult,FizzBuzz.returnFizzBuzz(number));
    }
    @Test
    @DisplayName("case contain 5")
    public void testCaseContain5(){
        int number = 857;
        String expectedResult = "8Buzz7";
        assertEquals(expectedResult,FizzBuzz.returnFizzBuzz(number));
    }

    @Test
    @DisplayName("case contain 3,5")
    public void testCaseContain35(){
        int number = 358;
        String expectedResult = "FizzBuzz8";
        assertEquals(expectedResult,FizzBuzz.returnFizzBuzz(number));
    }
}
