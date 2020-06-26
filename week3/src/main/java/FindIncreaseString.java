
import java.util.LinkedList;
import java.util.Scanner;

public class FindIncreaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String string = scanner.nextLine().replace(" ", "");
        System.out.println("Original string: " + string);
        System.out.println("IncreaseContinuedString: " + findIncreaseContinuedString(string));
        System.out.println("IncreaseString: " + findIncreaseString(string));
    }

    static String findIncreaseContinuedString(String string) {
        LinkedList<Character> foundString = new LinkedList<>();
        LinkedList<Character> longestString = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (foundString.size() == 0) {
                foundString.add(string.charAt(i));
            } else {
                if (string.charAt(i) > foundString.getLast()) {
                    foundString.add(string.charAt(i));
                } else {
                    foundString.clear();
                    foundString.add(string.charAt(i));
                }
                if (foundString.size() > longestString.size()) {
                    longestString.clear();
                    longestString.addAll(foundString);
                }
            }
        }
        String result = "";
        for (Character c : longestString) {
            result += c;
        }
        return result;
    }

    static String findIncreaseString(String string) {
        LinkedList<Character> longestString = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> foundString = new LinkedList<>();
            foundString.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > foundString.getLast()) {
                    foundString.add(string.charAt(j));
                }
            }
            if (foundString.size() > longestString.size()) {
                longestString.clear();
                longestString.addAll(foundString);
            }
        }
        String result = "";
        for (Character c : longestString) {
            result += c;
        }
        return result;
    }
}
