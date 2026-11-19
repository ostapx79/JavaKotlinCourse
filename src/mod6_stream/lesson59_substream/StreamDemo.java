package mod6_stream.lesson59_substream;

import java.util.ArrayList;
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

        List<Student> studentsAfterSkip = students.stream()
                .skip(5)
                .toList();
        System.out.println(studentsAfterSkip);

        List<Student> studentsAfterLimit = students.stream()
                .limit(7)
                .toList();
        System.out.println(studentsAfterLimit);

        List<String> modifiedNames = students.stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .peek(name -> System.out.println("peek() = " + name))
                .toList();
        System.out.println(modifiedNames);

        var stream1 = students.stream()
                .map(Student::getName)
                .limit(4);

        var stream2 = Stream.of("Konstantin", "Ivan", "Ivan", "Max");
        List<String> nameAfterConcat = Stream.concat(stream1, stream2)
                .distinct()
                .toList();
        System.out.println(nameAfterConcat);
    }
}
