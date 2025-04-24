package mod3_oop.lesson34_polimorphism;

public class OOPDemo {
    public static void main(String[] args) {
//        Person kostya = Person.getInstance("Kostya Galus", 45);
//        Student john = Student.getInstance("John Doe");

        Person kostya = new Person("Kostya Galus", 45);
        Student john = new Student("John Doe", 33, 3);

        Person ivan = new Student("Ivan Ivanovitch");

        System.out.println("Person instance kostya.sayHello();");
        kostya.sayHello();
        System.out.println("Student instance johny.sayHello();");
        john.sayHello();

        System.out.println("Student instance of Person superclass ivan.sayHello();");
        ivan.sayHello();

        System.out.println("ivan instanceof Student: " + (ivan instanceof Student));
        System.out.println("ivan instanceof Person: " + (ivan instanceof Person));

        System.out.println("john instanceof Student: " + (john instanceof Student));
        System.out.println("john instanceof Person: " + (john instanceof Person));
    }
}
