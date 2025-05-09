package mod3_oop.lesson39_enum_class;

import static mod3_oop.lesson39_enum_class.DayOfWeek.*;

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println("Today is " + SUNDAY);
        System.out.println("Today is " + TUESDAY);

        DayOfWeek day = MONDAY;
        if (day == SUNDAY || day == SATURDAY) {
            System.out.println("Day off of the week is " + day + ".");
        } else {
            System.out.println("Working day of the week is " + day + ".");
        }

        System.out.println(FRIDAY + " on russian language is " + FRIDAY.getRussianTranslate());
    }
}
