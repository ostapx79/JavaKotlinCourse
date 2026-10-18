package mod3_oop.lesson37_interface;

public abstract class Person {
    protected String name;
    protected int age;

    private static final String KIND = "HUMAN";

    public static String getKIND() {
        return KIND;
    }

    public Person() {
    }

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
}
