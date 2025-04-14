package mod3_oop.lesson29_factory_method

import java.text.SimpleDateFormat
import java.util.Date

class PersonKt(var name: String, var age: Int) {

    constructor() : this("", 0)

    constructor(name: String) : this(name, 0) { this.name = name }

    var birth: Date = Date()
        get() = SimpleDateFormat("yyyy.MM.dd").parse(SimpleDateFormat("yyyy.MM.dd").format(field))
        set(value) {
            field = value
        }

    fun sayHello(): Unit {
        println("Hello, my name is ${this.name}.")
    }

    companion object {
        const val KIND = "Human"

        fun getInstance() = PersonKt()
        fun getInstance(name: String) = PersonKt(name)
        fun getInstance(name: String, age: Int) = PersonKt(name, age)
    }
}