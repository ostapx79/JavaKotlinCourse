package syntax.lesson12_string_templates

fun main() {
    val nameOfManager = "Konstantin Galus"

    println("Hi, " + nameOfManager + "!")
    println("Hello, $nameOfManager!")
    
    val a: Int = 4
    val b = 8
    
    println("The sum a + b = ${a + b}")
}