package mod3_oop.lesson38_functional_interface

fun main() {
    val englishGreeting: (String) -> Unit = { name -> println("Hello, $name!")}
    englishGreeting("Kostya")

    object : GreetingKt {
        override fun sayHello(name: String) {
            println("Bonjour, $name!")
        }
    }.sayHello("Fransua Mean")

    val russianGreeting = GreetingKt {name: String -> println("Привет, $name!")}
    russianGreeting.sayHello("Костя")
}