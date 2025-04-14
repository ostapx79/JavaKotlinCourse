package mod3_oop.lesson28_static_fields_method;

public class Person {
    private String name;
    private int age;

    private static final String KIND = "HUMAN";

    public static String getKIND() { return KIND; }

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void sayHello() {
        System.out.println("Hello, my name is " + name + ".");
    }
}
