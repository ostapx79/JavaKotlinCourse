package mod3_oop.lesson33_inheritance

class TeacherKt : Person {
    var subject : String = ""

    constructor() {}
    constructor(name : String) : super(name)
    constructor(name : String, age : Int) : super(name, age)
    constructor(name : String, age : Int, subject : String) : super(name, age) {
        this.subject = subject
    }

    override fun sayHello() {
        println("Hello, my name is $name. I'm a teacher.")
    }

    companion object {
        fun getInstance() = TeacherKt()
        fun getInstance(name: String) = TeacherKt(name)
        fun getInstance(name: String, age: Int) = TeacherKt(name, age)
        fun getInstance(other: TeacherKt) = TeacherKt(other.name, other.age)
    }
}