package mod3_oop.lesson25_class;

public class OOPDemo {
    public static void main(String[] args) {
        Person konstantin = new Person();

        konstantin.name = "Konstantin Galus";
        konstantin.age = 45;

        konstantin.sayHello();

        PersonKt kotlinPerson = new PersonKt();
        kotlinPerson.setName("John");
        kotlinPerson.setAge(32);
        kotlinPerson.sayHello();
    }
}
