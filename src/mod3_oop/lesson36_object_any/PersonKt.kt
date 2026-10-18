package mod3_oop.lesson36_object_any

import java.text.SimpleDateFormat
import java.util.Date

abstract class PersonKt(var name: String, var age: Int) {

    constructor() : this("", 0)

    constructor(name: String) : this(name, 0) {
        this.name = name
    }

    var birth: Date = Date()
        get() = SimpleDateFormat("yyyy.MM.dd")
            .parse(SimpleDateFormat("yyyy.MM.dd").format(field))
        set(value) {
            field = value
        }

    abstract fun sayHello()

    companion object {
        const val KIND = "Human"
    }
}