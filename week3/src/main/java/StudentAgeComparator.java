import java.util.Comparator;

public class StudentAgeComparator implements Comparator<ComparableStudent> {
    @Override
    public int compare(ComparableStudent o1, ComparableStudent o2) {
        if (o1.getAge() == o2.getAge()){
            return 0;
        }else {
            return o1.getAge() - o2.getAge();
        }
    }
}
