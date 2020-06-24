
import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    private LocalDate birthday;
    private String name;
    private boolean gender;
    public Employee(String name, LocalDate birthday,boolean gender){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Employee o) {
       return this.getBirthday().compareTo(o.birthday);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ". Gender: " + getGender() + ". Birthday: " + getBirthday();
    }
}
