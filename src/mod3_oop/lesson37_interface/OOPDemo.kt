package mod3_oop.lesson37_interface

fun main() {
    var harry = StudentKt("Harry Potter", 17, 4)
    var kostya = StudentKt("Kostya Galus", 46, 3)
    var kostya2 = StudentKt("Kostya Galus", 46, 3)

    println(harry)
    println(kostya)
    println(kostya2)

    println(harry.hashCode())
    println(kostya.hashCode())
    println(kostya2.hashCode())

    println(harry.equals(kostya2))
    println(kostya.equals(kostya2))

    // Data Class

    val ivan = StudentDataClass("Ivan Galustyan", 39, 3)
    println(ivan)
}