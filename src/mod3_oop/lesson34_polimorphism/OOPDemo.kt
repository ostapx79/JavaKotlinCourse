package mod3_oop.lesson34_polimorphism

fun main() {
    val harry = StudentKt("Harry Potter", 17, 4)

    var kostya: PersonKt = StudentKt("Kostya Galus")
//    harry = kostya as StudentKt
    kostya = harry
    println("Harry is StudentKt: ${harry is StudentKt}")
    println("Harry is PersonKt: ${harry is PersonKt}")
    println("Kostya is StudentKt: ${kostya is StudentKt}")
    println("Kostya is PersonKt: ${kostya is PersonKt}")

    harry.sayHello()


}