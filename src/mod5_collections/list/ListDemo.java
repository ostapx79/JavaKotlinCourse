package mod5_collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        // Arrays
        String[] arr = {"Kostya", "Max", "Tolya"};

        for (String name : arr) {
            System.out.println(name);
        }

        arr[2] = "Lena";

        for (String name : arr) {
            System.out.println(name);
        }

        // List
        List<String> names = new ArrayList<>();
        names.add("Kostya");
        names.add("Max");
        names.add("Tolya");

        System.out.println(names);

        names.add("Katya");
        System.out.println(names);

        System.out.println("The first element is " + names.get(0));
        System.out.println("The second element is " + names.get(1));
        System.out.println("The last element is " + names.get(names.size() - 1));

        names.set(2, "Suzan");
        System.out.println(names);

        names.remove("Suzan");
//        names.remove(3);
//        names.removeLast();
//        names.removeFirst();
        System.out.println(names);

        System.out.println("The list contains \"Suzan\": " + names.contains("Suzan"));
        System.out.println("The list contains \"Kostya\": " + names.contains("Kostya"));
        System.out.println("The list contains \"Max\": " + names.contains("Max"));



    }
}
