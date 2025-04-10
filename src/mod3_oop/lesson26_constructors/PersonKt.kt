package mod3_oop.lesson26_constructors

class PersonKt (var name: String, var age: Int){

    // пустой конструктор
    constructor(): this("", 0)

    // конструктор с параметром name
    constructor(name: String): this(name, 0) {
        this.name = name
    }

    fun sayHello(): Unit {
        println("Hello, my name is ${name}!")
    }

}