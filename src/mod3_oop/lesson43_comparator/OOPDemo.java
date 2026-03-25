package mod3_oop.lesson43_comparator;

import java.util.Comparator;

public class OOPDemo {
    public static void main(String[] args) {
        // Comparable
//        Integer int1 = 10;
//        Integer int2 = 16;
//        Integer int3 = 16;
//
//        System.out.println(int1.compareTo(int2)); // -1
//        System.out.println(int2.compareTo(int1)); // 1
//        System.out.println(int2.compareTo(int3)); // 0
//        System.out.println();
//
//        var student1 = Student.getInstance("Kostya", 33, 4);
//        var student2 = Student.getInstance("Tolya", 30, 2);
//
//        System.out.println(student1.compareTo(student2));
//        System.out.println(student2.compareTo(student1));
//
//        String str1 = "a";
//        String str2 = "z";
//
//        System.out.println(str1.compareTo(str2));

        // Comparator
        var student1 = Student.getInstance("Kostya", 33, 4);
        var student2 = Student.getInstance("Tolya", 30, 2);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.compareTo(s2);
            }
        };

        System.out.println(comparator.compare(student1, student2));
        // System.out.println(student1.compare(student1, student2));

    }
}
