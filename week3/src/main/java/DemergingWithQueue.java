import java.time.*;
import java.util.*;

public class DemergingWithQueue {
    private static Queue<Employee> femaleEmployees = new PriorityQueue();
    private static Queue<Employee> maleEmployees = new PriorityQueue();

    public static void main(String[] args) {
        List<Employee> result = new ArrayList<>();
        addNewEmployee(new Employee("Tung", LocalDate.of(1990, 1, 1), true));
        addNewEmployee(new Employee("Lan", LocalDate.of(1992, 5, 10), false));
        addNewEmployee(new Employee("Tuan", LocalDate.of(1995, 3, 21), true));
        addNewEmployee(new Employee("Mai", LocalDate.of(1991, 7, 13), false));
        addNewEmployee(new Employee("Dao", LocalDate.of(1994, 12, 17), false));
        addNewEmployee(new Employee("Hue", LocalDate.of(1992, 11, 22), false));
        addNewEmployee(new Employee("Dung", LocalDate.of(1995, 8, 19), true));
        addNewEmployee(new Employee("Hung", LocalDate.of(1996, 5, 15), true));
        int femaleSize = femaleEmployees.size();
        for (int i = 0; i < femaleSize; i++) {
            Employee temp;
            temp = femaleEmployees.poll();
            result.add(temp);
        }
        int maleSize = maleEmployees.size();
        for (int i = 0; i < maleSize; i++) {
            Employee temp;
            temp = maleEmployees.poll();
            result.add(temp);
        }

        for (Employee e : result) {
            System.out.println(e);
        }


    }

    public static void addNewEmployee(Employee e) {
        if (e.getGender()) {
            maleEmployees.add(e);
        } else {
            femaleEmployees.add(e);
        }
    }
}
