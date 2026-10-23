package mod4_exception.lesson49_hierarchy_of_exceptions

fun main() {
    val zero = 1;
    val str = "hello"

    try {
        println("15/zero=${15 / zero}")
        println("The length of string is ${str.length}")

        val arr = arrayOf(1, 2, 3)
        val num = str.toInt() ?: 0
        println("num=$num")
    } catch (e: NullPointerException) {
        println("The str is null. $e")
    } catch (e: NumberFormatException) {
        println(e)
    } catch (e: Exception) {
        when (e) {
            is ArithmeticException -> println(e)
            is ArrayIndexOutOfBoundsException -> println("Array Index Out of Bounds: $e")
            else -> println(e)
        }
    }

    println("The end of program!")
}