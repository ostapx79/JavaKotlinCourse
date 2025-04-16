package mod3_oop.lesson32_deep_copy;

public class OOPDemo {
    public static void main(String[] args) {
        // копирование по значению
        int int1 = 4;
        int int2 = 8;
        int int3 = int1;
        int3 = 15;

//        System.out.println(int3);
//        System.out.println(int1 == int2);

        Person kostya = Person.getInstance("Kostya");
        Person john = Person.getInstance("John");
//        Person somePerson = kostya;
        Person somePerson = Person.getInstance(kostya);
        somePerson.setName("Peter");
        System.out.println(kostya.getName());
    }
}
