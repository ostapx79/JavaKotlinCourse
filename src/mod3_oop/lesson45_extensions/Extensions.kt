package mod3_oop.lesson45_extensions

fun main() {

    val name = "Kostya"
    println(name.razvernyt())
    println("The number 10 is Even? answer: ${10.isEven()}")
    println("The number 10 is Even? answer: ${23.isEven()}")

    val someString = "Saint Petersburg "
    println(someString.povtori(5))
}

// Extensions
fun String.razvernyt(): String = this.reversed()

fun Int.isEven() = this % 2 == 0

fun String.povtori(cnt: Int) = this.repeat(cnt)