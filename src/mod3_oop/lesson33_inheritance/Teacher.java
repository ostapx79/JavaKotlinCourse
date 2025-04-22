package mod3_oop.lesson33_inheritance;

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

    public static TeacherKt getInstance(String name) {
        return new TeacherKt(name);
    }

    public static TeacherKt getInstance(String name, int age) {
        return new TeacherKt(name, age);
    }

    public static TeacherKt getInstance(String name, int age, String computerScienceTeacher) {
        return new TeacherKt(name, age, computerScienceTeacher);
    }

    public static TeacherKt getInstance(TeacherKt other) {
        return new TeacherKt(other.getName(), other.getAge());
    }
}
