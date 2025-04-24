package mod3_oop.lesson34_polimorphism;

public class Person {
    protected String name;
    protected int age;

    private static final String KIND = "HUMAN";

    public static String getKIND() { return KIND; }

    public Person() {}

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
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

    // фабричные методы
    public static Person getInstance() {
        return new Person();
    }

    public static Person getInstance(String name) {
        return new Person(name);
    }

    public static Person getInstance(String name, int age) {
        return new Person(name, age);
    }

    public static Person getInstance(Person other) {
        return new Person(other.getName(), other.getAge());
    }
}
