public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(returnFizzBuzz(137));
    }
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
            resultString = resultString.replace("1", "One");
            resultString = resultString.replace("2", "Two");
            resultString = resultString.replace("4", "Four");
            resultString = resultString.replace("6", "Six");
            resultString = resultString.replace("7", "Seven");
            resultString = resultString.replace("8", "Eight");
            resultString = resultString.replace("9", "Nine");
        }

        return resultString;
    }

}
