package mod3_oop.lesson35_abstract

class StudentKt : PersonKt {

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

    companion object {
        const val KIND = PersonKt.KIND
        fun getInstance() = StudentKt()
        fun getInstance(name : String) = StudentKt(name)
        fun getInstance(name : String, age : Int) = StudentKt(name, age)
        fun getInstance(other: StudentKt) = StudentKt(other.name, other.age)
    }
}