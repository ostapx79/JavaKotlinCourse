package mod3_oop.lesson37_interface

import java.util.Objects

class StudentKt : PersonKt, GreetingKt {

    var course : Int = 0

    constructor() : super()
    constructor(name : String) : super(name)
    constructor(name : String, age : Int) : super(name, age)
    constructor(name : String, age : Int, course : Int) : super(name, age) {
        this.course = course
    }

    override fun sayHello() {
        println("Hello, my name is $name. I'm a student.")
    }

    override fun toString(): String {
        return "StudentKt[name = $name, age = $age, course = $course]"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StudentKt) return false
        return name === other.name
                && age == other.age
                && course == other.course
    }

    override fun hashCode(): Int {
        return Objects.hash(name, age, course)
    }

    companion object {
        const val KIND = PersonKt.KIND
        fun getInstance() = StudentKt()
        fun getInstance(name : String) = StudentKt(name)
        fun getInstance(name : String, age : Int) = StudentKt(name, age)
        fun getInstance(other: StudentKt) = StudentKt(other.name, other.age)
    }
}