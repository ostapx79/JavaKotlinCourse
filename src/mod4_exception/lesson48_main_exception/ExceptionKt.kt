package mod4_exception.lesson48_main_exception

fun main() {
    val zero = 1
    val str: String? = null

    try {
        println("15/zero=" + 15 / zero)
        println("The length of string is ${str?.length}")
//        throw NullPointerException()

        val arr = arrayOf(1, 2, 3, 4)
//        val element = arr[15]

        val num = str?.toInt() ?: 0
        println("num=$num")

    } catch (e: ArithmeticException) {
        println(e)
    } catch (e: NullPointerException) {
        println("The str is null.$e")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e)
    } catch (e: NumberFormatException) {
        println(e)
    } finally {
        println("The end of try-catch block")
    }

    println("The end program!")
}