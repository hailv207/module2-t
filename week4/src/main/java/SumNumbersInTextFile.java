import java.io.*;
import java.util.Scanner;

public class SumNumbersInTextFile {
    public static void main(String[] args) {
        String filePath = "/Users/vuhaile/CodeGym/module2-t/week4/src/main/resources/test1.txt";
        String number = "1";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number:");
            number = scanner.nextLine();

            writeTextFile(filePath,"\n" + number);
            readTextFile(filePath);
        } while (number != "");
        readTextFile(filePath);
    }

    public static void writeTextFile(String filePath, String number) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(number);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readTextFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
