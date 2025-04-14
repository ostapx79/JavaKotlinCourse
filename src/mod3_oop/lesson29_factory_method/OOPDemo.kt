package mod3_oop.lesson29_factory_method

fun main() {
    val selena = PersonKt.getInstance("Selena Gomez", 38)
    selena.sayHello()
    println(selena.age);
}