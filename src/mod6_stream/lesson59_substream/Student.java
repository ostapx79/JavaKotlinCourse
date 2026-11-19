package mod6_stream.lesson59_substream;

public class Student {
    private String name;
    private Integer age;
    private Integer course;

    public Student(String name, Integer age, Integer course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
//    private int course;
//
//    public Student() {
//        super();
//    }
//
//    public Student(String name) {
//        super(name);
//    }
//
//    public Student(String name, int age) {
//        super(name, age);
//    }
//
//    public Student(String name, int age, int course) {
//        this(name, age);
//        this.course = course;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//    @Override
//    public void sayHello() {
//        System.out.println("Hello, my name is " + name + ". I'm a student.");
//    }
//
//    public static Student getInstance() {
//        return new Student();
//    }
//
//    public static Student getInstance(String name) {
//        return new Student(name);
//    }
//
//    public static Student getInstance(String name, int age) {
//        return new Student(name, age);
//    }
//
//    public static Student getInstance(String name, int age, int course) {
//        return new Student(name, age, course);
//    }
//
//    public static Student getInstance(Student other) {
//        return new Student(other.getName(), other.getAge());
//    }
//
    @Override
    public String toString() {
        return "Student[name = " + getName() + ", age = " + getAge() + ", course = " + getCourse() + "]";
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Student otherStudent = (Student) obj;
//        return this.getName().equals(otherStudent.getName()) && this.getAge() == otherStudent.getAge()
//                && this.getCourse() == otherStudent.getCourse() && this.hashCode() == otherStudent.hashCode();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getAge(), getCourse());
//    }
}
