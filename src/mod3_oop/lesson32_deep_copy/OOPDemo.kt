package mod3_oop.lesson32_deep_copy

fun main() {
    val selena = PersonKt.getInstance("Selena Gomez", 38)
    selena.sayHello()
    println(selena.age)

    val madonna = PersonKt.getInstance("Madonna")
    // val thirdPerson = selena // by reference
    val thirdPerson = PersonKt.getInstance(selena) // deep copy
    thirdPerson.name = "Alexa Vega"
    println(selena.name)
}