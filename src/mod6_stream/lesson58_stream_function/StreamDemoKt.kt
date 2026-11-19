package mod6_stream.lesson58_stream_function

fun main() {
    val students = listOf(
        Student("Alice", 20, 3),
        Student("Bob", 22, 4),
        Student("Charlie", 21, 3),
        Student("Katherine", 21, 3),
        Student("Liam", 19, 2),
        Student("Mia", 20, 3),
        Student("Noah", 22, 4),
        Student("Olivia", 21, 3),
        Student("David", 19, 2),
        Student("Emma", 20, 3),
        Student("Frank", 22, 4),
        Student("Grace", 21, 3),
        Student("Helena", 19, 2),
        Student("Isabella", 20, 3),
        Student("Jack", 22, 4)
    )

    // Кол-во третьекурсников
    val cnt = students.count { it.course == 3 }
    println(cnt)

    // Студенты старше 20 лет
    val studentsOlder20 = students.filter { it.age > 20 }
    println(studentsOlder20)

    // Массив с именами студентов
    val studentNames = students.map { it.name }
    println(studentNames)

    // Отсортируйте по именам
    val sortedByName = students.sortedBy { it.name }
    println(sortedByName)

    // Отсортируйте по годам
    val sortedByAge = students.sortedBy { it.age }
    println(sortedByAge)

    // Отсортируйте по курсам
    val sortedByCourse = students.sortedBy { it.course }
    println(sortedByCourse)

    // Достать первого студента из 4-го курса
    val firstStudentFromFourthCourse = students.first { it.course == 4 }
    println(firstStudentFromFourthCourse)

    // Суммарное количество лет всех студентов
    val totalAge = students.sumOf { it.age }
    println("Total age = $totalAge")

    // Вычислить средний возраст всех студентов
    val avgAge = students.map { it.age }.average()
    println("The avg age is = $avgAge")
}