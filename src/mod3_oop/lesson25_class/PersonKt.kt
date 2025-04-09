package mod3_oop.lesson25_class

class PersonKt {
    var name: String = ""
    var age: Int = 0

    fun sayHello(): Unit {
        println("Hello, my name is ${this.name}.")
    }
}