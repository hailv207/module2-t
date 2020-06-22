import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before reversing:");
        for (int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }
        System.out.println("Array after reversing:");
        for (int i = 0;i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
