import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class NextDayCalculator {
    public static int[] getNextDay(int day, int month, int year) {
        int monthMaxDay = 30;
        boolean isLeapYear = checkLeapYear(year);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthMaxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthMaxDay = 30;
                break;
            case 2:
                if (isLeapYear) {
                    monthMaxDay = 29;
                } else {
                    monthMaxDay = 28;
                }
                break;
        }

        boolean isInvalidDay = day < 1 || day > monthMaxDay;
        boolean isInvalidMonth = month < 1 || month > 12;
        boolean isInvalidYear = year < 1900;

        if (isInvalidDay || isInvalidMonth || isInvalidYear){
            throw new InputMismatchException("Invalid date.");
        }

        if (day == monthMaxDay) {
            day = 1;
            if (month == 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }
        } else {
            day += 1;
        }
        int[] result = {day, month, year};
        return result;
    }

    public static boolean checkLeapYear(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (year > 0) {
            if ((isDivisibleBy4 && !isDivisibleBy100) || (isDivisibleBy100 && isDivisibleBy400)) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

}
