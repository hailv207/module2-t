public class AbsoluteNumberCalculator {
    public static double absoluteNumberCalculate(double number) {
        double result = number;
        if (number < 0) {
            result = -number;
        }
        return result;
    }
}
