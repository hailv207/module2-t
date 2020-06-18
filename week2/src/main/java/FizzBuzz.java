public class FizzBuzz {
    public static String returnFizzBuzz(int number) {
        String resultString = "";
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                resultString = "FizzBuzz";
            } else {
                resultString = "Fizz";
            }
        } else if (number % 5 == 0) {
            resultString = "Buzz";
        } else {
            resultString = number + "";
            resultString = resultString.replace("3", "Fizz");
            resultString = resultString.replace("5", "Buzz");
        }

        return resultString;
    }

}
