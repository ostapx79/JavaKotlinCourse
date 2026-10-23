package mod4_exception.lesson51_custom_exceptions

fun main() {
    try {
        val student2 = Student.getInstance("Kostya")
        if (student2.course < 1) throw StudentException("Course must be grater or equal 1")
    } catch (e: StudentException) {
        println(e)
    }
}