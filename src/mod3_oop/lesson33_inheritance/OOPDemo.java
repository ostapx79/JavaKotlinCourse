package mod3_oop.lesson33_inheritance;

public class OOPDemo {
    public static void main(String[] args) {
//        Person kostya = Person.getInstance("Kostya Galus", 45);
//        Student john = Student.getInstance("John Doe");

        Person kostya = new Person("Kostya Galus", 45);
        Student john = new Student("John Doe");

        kostya.sayHello();
        john.sayHello();
    }
}
