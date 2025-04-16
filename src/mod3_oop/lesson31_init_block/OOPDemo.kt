package mod3_oop.lesson31_init_block

fun main() {
    val selena = PersonKt.getInstance("Selena Gomez", 38)
    selena.sayHello()
    println(selena.age);
}