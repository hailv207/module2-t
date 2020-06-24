
public class ComparableStudent implements Comparable<ComparableStudent> {
    private String name;
    private int age;
    public ComparableStudent(String name, int age){
        this.name = name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String str  = "Student name: " + getName() + ". Age: " + getAge() + ".";
        return str;
    }

    @Override
    public int compareTo(ComparableStudent o) {
        return this.getName().compareTo(o.getName());
    }
}
