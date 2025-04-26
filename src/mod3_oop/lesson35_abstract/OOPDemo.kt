package mod3_oop.lesson35_abstract

fun main() {
    var harry = StudentKt("Harry Potter", 17, 4)

    var kostya:PersonKt = StudentKt("Kostya Galus")
//    harry = kostya as StudentKt
    kostya = harry
    println("harry is StudentKt: ${harry is StudentKt}")
    println("harry is PersonKt: ${harry is PersonKt}")
    println("kostya is StudentKt: ${kostya is StudentKt}")
    println("kostya is PersonKt: ${kostya is PersonKt}")

    harry.sayHello()


}