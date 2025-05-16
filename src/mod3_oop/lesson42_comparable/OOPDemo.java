package mod3_oop.lesson42_comparable;

public class OOPDemo {
    public static void main(String[] args) {
        Integer int1 = 10;
        Integer int2 = 16;
        Integer int3 = 16;

        System.out.println(int1.compareTo(int2)); // -1
        System.out.println(int2.compareTo(int1)); // 1
        System.out.println(int2.compareTo(int3)); // 0
        System.out.println();

        var student1 = Student.getInstance("Kostya", 33, 4);
        var student2 = Student.getInstance("Tolya", 30, 2);

        System.out.println(student1.compareTo(student2));
        System.out.println(student2.compareTo(student1));

        String str1 = "a";
        String str2 = "z";

        System.out.println(str1.compareTo(str2));
    }
}
