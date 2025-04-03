package syntax.lesson13_null

fun main() {
    var nullableString: String? = "Konstantin"
    println(nullableString?.uppercase() ?: "Null value here")

    val PI:Double? = null
    println("The pi constant is ${PI ?: "3.14"}")

}