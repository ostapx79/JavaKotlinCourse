package mod3_oop.lesson44_generics

fun main() {
    val person = PersonKt("Bob", 1)
    println(person)
    person.age = 23
    println(person)
    person.sayHello()
    println(person.id)

}