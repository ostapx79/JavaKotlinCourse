package mod3_oop.lesson45_reflection

fun main() {
    val kostya = StudentKt("Kostya", 43, 5)

    val classStudent = StudentKt::class.java

    // Constructors[]
    val constructors = classStudent.declaredConstructors
    for (constructor in constructors) {
        println(constructor)
    }

    // Fields[]
    val fields = classStudent.declaredFields
    for (field in fields) {
        println(field)
    }

    // Methods[]
    val methods = classStudent.declaredMethods
    for (method in methods) {
        println(method)
    }

    val sayHelloMethod = classStudent.getMethod("sayHello")
    sayHelloMethod.invoke(kostya)
}