package mod3_oop.lesson27_encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {
        // java
        Person kostya = new Person();
        kostya.setName("Kostya Galus");
        kostya.setAge(45);
        kostya.sayHello();

        Person john = new Person("John Doe", 35);
        john.sayHello();

        Person ivan = new Person("Ivan");
        ivan.sayHello();

        // kotlin
        PersonKt gabriela = new PersonKt();
        gabriela.setName("Gabriela");
        gabriela.setAge(23);
        gabriela.sayHello();

        var selena = new PersonKt("Selena Gomez");
        selena.setBirth(new SimpleDateFormat("dd.MM.yyyy").parse("22.07.1992"));
        selena.sayHello();
        System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(selena.getBirth()));

    }
}
