package mod6_stream.lesson58_stream_function;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Alice", 20, 3));
        students.add(new Student("Bob", 22, 4));
        students.add(new Student("Charlie", 21, 3));
        students.add(new Student("David", 19, 2));
        students.add(new Student("Emma", 20, 3));
        students.add(new Student("Frank", 22, 4));
        students.add(new Student("Grace", 21, 3));
        students.add(new Student("Helena", 19, 2));
        students.add(new Student("Isabella", 20, 3));
        students.add(new Student("Jack", 22, 4));
        students.add(new Student("Katherine", 21, 3));
        students.add(new Student("Liam", 19, 2));
        students.add(new Student("Mia", 20, 3));
        students.add(new Student("Noah", 22, 4));
        students.add(new Student("Olivia", 21, 3));

        int cntS = (int) students.stream()
                .filter(student -> student.getCourse() == 21)
                .count();
        System.out.println(cntS);

        // Студенты старше 20 лет.
        List<Student> studentOlder20 = students.stream()
                .filter(student -> student.getAge() > 20)
                .toList();
        System.out.println("Находим возраст студентов от 21 и больше.\n");
        for (Student student : studentOlder20) {
            System.out.println(student);
        }
        System.out.println();

        // Массив с именами студентов
        List<String> studentsName = students.stream()
                .map(Student::getName)
                .toList();
        for (String name : studentsName) {
            System.out.println("Имена студентов -> " + name + ".");
        }

        // Отсортируйте по именам
        List<Student> sortedByName = students.stream()
                .sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
                .toList();
        System.out.println(sortedByName);

        // Отсортируйте по именам
        List<Student> sortedByAge = students.stream()
                .sorted((student1, student2) -> student1.getAge().compareTo(student2.getAge()))
                .toList();
        System.out.println(sortedByAge);

        // Отсортируйте по курсам
        List<Student> sortedByCourse = students.stream()
                .sorted((student1, student2) -> student1.getCourse().compareTo(student2.getCourse()))
                .toList();
        System.out.println(sortedByCourse);

        // Достать первого студента из 4-го курса
        Student firstStudentFromFourthCourse = students.stream()
                .filter(student -> student.getCourse() == 4)
                .findFirst()
                .orElse(null);
        System.out.println(firstStudentFromFourthCourse);

        // Суммарное количество лет всех студентов
        int totalAge = students.stream()
                .mapToInt(Student::getAge)
                .sum();
        System.out.println("Total age = " + totalAge);

        // Вычислить средний возраст всех студентов
        double avgAge = students.stream()
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);
        System.out.println("The avg age is = " + avgAge);
    }
}
