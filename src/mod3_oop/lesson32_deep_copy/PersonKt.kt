package mod3_oop.lesson32_deep_copy

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

    init {
        println("The new object of kotlin class PersonKt is created!")
    }

    fun sayHello(): Unit {
        println("Hello, my name is ${this.name}.")
    }

    companion object {
        const val KIND = "Human"

        fun getInstance() = PersonKt()
        fun getInstance(name: String) = PersonKt(name)
        fun getInstance(name: String, age: Int) = PersonKt(name, age)
        fun getInstance(other: PersonKt) = PersonKt(other.name, other.age)
    }
}