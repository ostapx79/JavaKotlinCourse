package mod3_oop.lesson30_this_for_calling_other_constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {
        // java
//        Person kostya = new Person();
        Person kostya = Person.getInstance();
        kostya.setName("Kostya Galus");
        kostya.setAge(45);
        kostya.sayHello();
        System.out.println("The kind of Person is " + Person.getKIND());

//        Person john = new Person("John Doe", 35);
        Person john = Person.getInstance("John Doe", 35);
        john.sayHello();
        System.out.println(john.getAge());

//        Person ivan = new Person("Ivan");
        Person ivan = Person.getInstance("Ivan");
        ivan.sayHello();

        // kotlin
//        PersonKt gabriela = new PersonKt();
        PersonKt gabriella = PersonKt.Companion.getInstance();
        gabriella.setName("Gabriella");
        gabriella.setAge(23);
        gabriella.sayHello();

//        var selena = new PersonKt("Selena Gomez");
        var selena = PersonKt.Companion.getInstance("Selena");
        System.out.println("The kind of PersonKt is " + PersonKt.KIND + "!");
        selena.setBirth(new SimpleDateFormat("dd.MM.yyyy").parse("22.07.1992"));
        selena.sayHello();
        System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(selena.getBirth()));

    }
}
