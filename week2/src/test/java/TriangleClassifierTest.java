import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {
    @Test
    @DisplayName("case equilateral triangle")
    public void testEquilateralTriangle(){
        double firstSide = 2;
        double secondSide = 2;
        double thirdSide = 2;

        String expectedResult = "Equilateral Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(2,2,2));
    }

    @Test
    @DisplayName("case isosceles triangle")
    public void testIsoscelesTriangle(){
        double firstSide = 2;
        double secondSide = 2;
        double thirdSide = 3;

        String expectedResult = "Isosceles Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(2,2,3));
    }

    @Test
    @DisplayName("case right triangle")
    public void testRightTriangle(){
        double firstSide = 3;
        double secondSide = 4;
        double thirdSide = 5;

        String expectedResult = "Right Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(3,4,5));


    }

    @Test
    @DisplayName("case unreal triangle 1")
    public void testUnrealTriangleCase1(){
        double firstSide = 8;
        double secondSide = 2;
        double thirdSide = 3;

        String expectedResult = "Is not a Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(8,2,3));
    }

    @Test
    @DisplayName("case unreal triangle 2")
    public void testUnrealTriangleCase2(){
        double firstSide = -1;
        double secondSide = 2;
        double thirdSide = 1;

        String expectedResult = "Is not a Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(-1,2,1));
    }


    @Test
    @DisplayName("case unreal triangle 3")
    public void testUnrealTriangleCase3(){
        double firstSide = 0;
        double secondSide = 1;
        double thirdSide = 1;

        String expectedResult = "Is not a Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(0,1,1));
    }


    @Test
    @DisplayName("case normal triangle 3")
    public void testNormalTriangle(){
        double firstSide = 5;
        double secondSide = 6;
        double thirdSide = 8;

        String expectedResult = "Normal Triangle";
        assertEquals(expectedResult,TriangleClassifier.classifyTriangle(5,6,8));
    }
}
