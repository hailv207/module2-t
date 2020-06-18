import jdk.nashorn.api.scripting.AbstractJSObject;

public class TriangleClassifier {
    public static String classifyTriangle(double firstSide, double secondSide, double thirdSide) {
        boolean isReasonableLength = firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;
        boolean isRealLength = firstSide > 0 && secondSide > 0 && thirdSide > 0;
        boolean isRightTriangle = Math.pow(firstSide, 2) == Math.pow(secondSide, 2) + Math.pow(thirdSide, 2)
                || Math.pow(secondSide, 2) == Math.pow(firstSide, 2) + Math.pow(thirdSide, 2)
                || Math.pow(thirdSide,2) == Math.pow(firstSide, 2) + Math.pow(secondSide, 2);
        String resultString = "";
        if (isRealLength && isReasonableLength) {
            if (isRightTriangle) {
                resultString = "Right Triangle";
            } else if (firstSide == secondSide && firstSide == thirdSide) {
                resultString = "Equilateral Triangle";
            } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
                resultString = "Isosceles Triangle";
            } else {
                resultString = "Normal Trinangle";
            }
        } else {
            resultString = "Is not a Triangle";
        }
        return resultString;
    }
}
