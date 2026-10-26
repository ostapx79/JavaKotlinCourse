package mod5_collections.lesson52_linkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Kostya");
        names.add("Tolya");
        names.add("Katya");

        System.out.println(names);

        System.out.println("The first element is " + names.get(0));
        System.out.println("The second element is " + names.get(1));
        System.out.println("The last element is " + names.get(names.size() - 1));

        names.set(2, "Suzan");
        System.out.println(names);

        names.removeLast();
        System.out.println(names);
        System.out.println("The linked list contains \"Andrey\": " + names.contains("Andrey"));
    }
}
