package mod3_oop.lesson30_this_for_calling_other_constructor

fun main() {
    val selena = PersonKt.getInstance("Selena Gomez", 38)
    selena.sayHello()
    println(selena.age);
}