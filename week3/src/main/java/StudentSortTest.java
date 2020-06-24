import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortTest {
    public static void main(String[] args) {
        ComparableStudent student = new ComparableStudent("Kien", 30);
        ComparableStudent student1 = new ComparableStudent("Nam", 26);
        ComparableStudent student2 = new ComparableStudent("Anh", 38);
        ComparableStudent student3 = new ComparableStudent("Tung", 38);

        List<ComparableStudent> lists = new ArrayList<ComparableStudent>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(ComparableStudent st : lists){
            System.out.println(st.toString());
        }

        StudentAgeComparator ageComparator = new StudentAgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(ComparableStudent st : lists){
            System.out.println(st.toString());
        }
    }
}
