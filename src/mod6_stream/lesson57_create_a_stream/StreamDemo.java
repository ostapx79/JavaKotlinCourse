package mod6_stream.lesson57_create_a_stream;

import kotlin.TuplesKt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

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

        // Without streams

        int cnt = 0;
        for (Student student : students) {
            if (student.getCourse() == 3) {
                cnt++;
            }
        }

        System.out.println("Count of student from third course is " + cnt + ".\n");

        int cntS = (int) students.stream()
                .filter(student -> student.getCourse() == 3)
                .count();

        System.out.println("Count of student from third course is " + cntS + ".\n");

        Stream<Student> streamStudent = students.stream();
        streamStudent
                .filter(student -> student.getCourse() == 3)
                .forEach(System.out::println);
        System.out.println();

        Stream<Object> streamStudentWay2 = Arrays.stream(students.toArray());
        streamStudentWay2
                .map(element -> (Student) element)
                .filter(student -> student.getCourse() == 4)
                .forEach(System.out::println);
        System.out.println();

//        Stream.iterate(1, x -> x + 1)
//                .forEach(System.out::println);

//        Stream.generate(Math::random).forEach(System.out::println);

        Stream.of(4, 8, 15, 16, 23, 42)
                .map(x -> Math.round(Math.pow(x, 2)))
                .forEach(System.out::println);
    }
}
