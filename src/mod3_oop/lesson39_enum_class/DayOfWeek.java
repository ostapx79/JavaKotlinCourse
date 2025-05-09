package mod3_oop.lesson39_enum_class;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    // вторник, среда, читверг, пятница, суббота, воскресенье

    private String russianDayOfWeek;

    DayOfWeek(String russianDayOfWeek) {
        this.russianDayOfWeek = russianDayOfWeek;
    }

    public String getRussianTranslate() {
        return russianDayOfWeek;
    }

    public void setRussianTranslate(String russianDayOfWeek) {
        this.russianDayOfWeek = russianDayOfWeek;
    }
}
