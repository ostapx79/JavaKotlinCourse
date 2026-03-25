package mod3_oop.lesson43_comparator

fun main() {
    val harry = StudentKt("Harry Potter", 23, 4)
    val john = StudentKt("John", 17, 2)

    println(harry.compareTo(john))

    val studentComparator = Comparator<StudentKt> { o1, o2 ->
        o1.compareTo(o2)
    }

    println(studentComparator.compare(harry, john))
}