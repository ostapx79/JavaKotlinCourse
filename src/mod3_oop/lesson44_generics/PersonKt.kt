package mod3_oop.lesson44_generics

import java.text.SimpleDateFormat
import java.util.Date

data class PersonKt<T>(
    var name: String,
    var age: Int,
    var id: T?
) {

    constructor() : this("", 0, null)
    constructor(name: String) : this(name, 0, null) {
        this.name = name
    }

    constructor(name: String, id: T) : this(name, 0, null) {
        this.name = name
        this.id = id
    }

    var birth: Date = Date()
        get() = SimpleDateFormat("yyyy.MM.dd").parse(SimpleDateFormat("yyyy.MM.dd").format(field))
        set(value) {
            field = value
        }

    fun sayHello(): Unit {
        println("Hello, my name is ${this.name}.")
    }

}