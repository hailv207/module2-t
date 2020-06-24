
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Please enter the Decimal number.");
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = scanner.nextInt();
        int input = decimalNumber;
        while (decimalNumber > 0) {
            stack.add(decimalNumber % 2);
            decimalNumber = (int) Math.floor(decimalNumber / 2);
        }
        String result = "";
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            result += stack.pop();
        }
        System.out.printf("Instance of %d in Binary:\n %s",input,result);
    }

}
