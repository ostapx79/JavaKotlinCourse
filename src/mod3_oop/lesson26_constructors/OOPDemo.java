package mod3_oop.lesson26_constructors;

public class OOPDemo {
    public static void main(String[] args) {

        // java
        Person konstantin = new Person();
        konstantin.name = "Konstantin";
        konstantin.age = 20;
        konstantin.sayHello();

        Person ivan = new Person("Ivan");
        ivan.sayHello();

        Person john = new Person("John Smith", 38);
        john.sayHello();

        // kotlin
        PersonKt ktPerson = new PersonKt();
        ktPerson.setName("Konstantin");
        ktPerson.setAge(34);
        ktPerson.sayHello();

        var selena = new PersonKt("Selena Gomez", 32);
        selena.sayHello();

    }
}
