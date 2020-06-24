
import java.util.Scanner;
import java.util.Stack;

public class BracketsChecking {
    public static void main(String[] args) {
        Stack<Character> openBracketStack = new Stack<>();
        System.out.println("Please enter expression:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        boolean isCorrectBrackets = true;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                openBracketStack.add(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (openBracketStack.size() == 0) {
                    isCorrectBrackets = false;
                } else {
                    openBracketStack.pop();
                }
            }
        }

        if (openBracketStack.size() == 0 && isCorrectBrackets) {
            System.out.println("Correct brackets used.");
        } else {
            System.out.println("Incorrect brackets used.");
        }
    }

}
