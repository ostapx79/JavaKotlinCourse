package mod3_oop.lesson25_class

fun main() {
    val konstantin: PersonKt = PersonKt()
    konstantin.name = "Konstantin Galus"
    konstantin.age = 45
    konstantin.sayHello()

    val ivan = PersonKt()
    ivan.name = "Ivan Khachatryan"
    ivan.age = 42
    ivan.sayHello()

    val person = Person()
    person.name = "Ivan Khachatryan"
    person.age = 43
    person.sayHello()

}