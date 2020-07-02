import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([+]84|0)\\d{9}");
        Matcher m = pattern.matcher("+84987123123");
        System.out.println(m.matches());
    }
}
