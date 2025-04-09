package mod1_syntax.lesson15_printf;

import java.time.LocalDateTime;

public class PrintfDemo {
    public static void main(String[] args) {
        // %s - String - строка
        var name = "Konstantin";
        System.out.printf("Hello, %s!%n", name);

        // %d - десятичное число
        var age = 45;
        System.out.printf("I'm %d years old%n", age);

        // %f - дробное число
        var height = 1.73;
        System.out.printf("My height is %.2f m%n", height);

        // %tF %tT - дата время
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.printf("Current date and time: %tF %tT%n", dateTime, dateTime);
    }
}
