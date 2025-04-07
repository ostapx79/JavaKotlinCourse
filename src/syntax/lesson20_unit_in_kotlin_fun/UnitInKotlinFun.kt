package syntax.lesson20_unit_in_kotlin_fun

fun main() {

    // анонимная функция (лямбда выражение), которая ни чего не возвращает
    val multiply:(Int, Int) -> Unit = { a, b -> println("a * b = ${a*b}") }
    multiply(22, 3)
    multiply1(9, 3)
    val sum: String = multiply2(22, 3)
    println(sum)
}

// именная функция, тоже ни чего не возвращает
fun multiply1(a: Int, b: Int) {
   println("a * b = ${a*b}")
}

// именная функция которая возвращает сумму двух чисел
fun multiply2(a: Int, b: Int): String {
    return ("a * b = ${a*b}")
}