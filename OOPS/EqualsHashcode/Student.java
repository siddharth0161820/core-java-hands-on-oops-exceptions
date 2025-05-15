package CoreJava.OOPS.EqualsHashcode;

import java.util.Objects;

public class Student {
    //1>Attributes
    private int age;
    private String name;
    private String place;

    //2>Constructor

    public Student(int age, String name, String place) {
        this.age = age;
        this.name = name;
        this.place = place;
    }
    //3>Getter Setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    //4>toString()

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    //5>Equals() & hashcode()

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(place, student.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, place);
    }
}
