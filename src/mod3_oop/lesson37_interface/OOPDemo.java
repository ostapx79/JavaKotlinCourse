package mod3_oop.lesson37_interface;

public class OOPDemo {
    public static void main(String[] args) {
        Person kostya = Student.getInstance("Kostya Galus", 45, 3);
        Person ivan = Student.getInstance("Ivan Galustyan", 39, 2);
        Person kostya2 = Student.getInstance("Kostya Galus", 45, 3);

        System.out.println(kostya.toString());
        System.out.println(kostya.equals(ivan));
        System.out.println(kostya.hashCode());;
        System.out.println(ivan.hashCode());

        System.out.println(kostya);
        System.out.println(kostya2);
        System.out.println(kostya.equals(kostya2));
        System.out.println(kostya.hashCode());
        System.out.println(kostya2.hashCode());
    }
}
