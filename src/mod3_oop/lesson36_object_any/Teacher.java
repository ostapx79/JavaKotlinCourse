package mod3_oop.lesson36_object_any;

public class Teacher extends Person {
    private String computerScienceTeacher;

    public Teacher() {
        super();
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String computerScienceTeacher) {
        this(name, age);
        this.computerScienceTeacher = computerScienceTeacher;
    }

    public String getComputerScienceTeacher() {
        return computerScienceTeacher;
    }

    public void setComputerScienceTeacher(String computerScienceTeacher) {
        this.computerScienceTeacher = computerScienceTeacher;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + ". I'm a teacher.");
    }

    public static Teacher getInstance(String name) {
        return new Teacher(name);
    }

    public static Teacher getInstance(String name, int age) {
        return new Teacher(name, age);
    }

    public static Teacher getInstance(String name, int age, String computerScienceTeacher) {
        return new Teacher(name, age, computerScienceTeacher);
    }

    public static Teacher getInstance(Teacher other) {
        return new Teacher(other.getName(), other.getAge());
    }
}
