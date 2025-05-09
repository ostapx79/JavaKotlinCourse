package mod3_oop.lesson39_enum_class

fun main() {
    println("Today is ${DayOfWeekKt.SUNDAY}")
    println("Today is ${DayOfWeekKt.MONDAY}")

    val day: DayOfWeekKt = DayOfWeekKt.MONDAY
    if (day === DayOfWeekKt.SUNDAY || day === DayOfWeekKt.SATURDAY) {
        println("Day off of the week is $day.")
    } else {
        println("Working day of the week is $day.")
    }

    when (day) {
        DayOfWeekKt.SUNDAY, DayOfWeekKt.SATURDAY -> println("Day off of the week is $day.")
        else -> println("Working day of the week is $day.")
    }

    println("The ${DayOfWeekKt.MONDAY} on russian day is ${DayOfWeekKt.MONDAY.russianDayOfWeekKt}. ")
}