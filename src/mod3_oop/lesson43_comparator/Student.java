package mod3_oop.lesson43_comparator;

import org.jetbrains.annotations.NotNull;
import java.util.Comparator;

public class Student extends Person implements Comparable<Student> { // , Comparator<Student> {

    private int course;

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int course) {
        this(name, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + ". I'm a student.");
    }

    public static Student getInstance() {
        return new Student();
    }

    public static Student getInstance(String name) {
        return new Student(name);
    }

    public static Student getInstance(String name, int age) {
        return new Student(name, age);
    }

    public static Student getInstance(String name, int age, int course) {
        return new Student(name, age, course);
    }

    public static Student getInstance(Student other) {
        return new Student(other.getName(), other.getAge());
    }

    @Override
    public int compareTo(@NotNull Student other) {
        if (this.getAge() > other.getAge()) {
            return 1;
        } else if (this.getAge() < other.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.compareTo(s2);
//    }
}
