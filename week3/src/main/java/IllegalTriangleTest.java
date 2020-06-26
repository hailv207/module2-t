import java.util.Scanner;

public class IllegalTriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first side of Triangle:");
        int firstSide = scanner.nextInt();
        System.out.println("Please enter the second side of Triangle:");
        int secondSide = scanner.nextInt();
        System.out.println("Please enter the third side of Triangle:");
        int thirdSide = scanner.nextInt();
        try {
            createTriangle(firstSide, secondSide, thirdSide);
        } catch (IllegalTriangleException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    static void createTriangle(int firstSide, int secondSide, int thirdSide) throws IllegalTriangleException {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0 || firstSide + secondSide <= thirdSide || firstSide + thirdSide <= secondSide || secondSide + thirdSide <= firstSide) {
            throw new IllegalTriangleException("Invalid sides!");
        }
    }
}

