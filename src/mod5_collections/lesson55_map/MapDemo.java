package mod5_collections.lesson55_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mapOfPeople = new HashMap<>();
        mapOfPeople.put("Kostya", 47);
        mapOfPeople.put("Max", 43);
        mapOfPeople.put("Katya", 39);

        System.out.println("HashMap: " + mapOfPeople);
        System.out.println("The Max's age is " + mapOfPeople.get("Max") + " years old.");

        mapOfPeople.put("Max", 41);
        System.out.println("The Max's age is " + mapOfPeople.get("Max") + " years old.");

        for (Map.Entry<String, Integer> entry : mapOfPeople.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();

            System.out.println("name: " + name + ", age: " + age);
        }

        Map<String, Integer> mapLinked = new LinkedHashMap<>();
        mapLinked.putAll(mapOfPeople);
        

        Map<String, Integer> sortedMapOfNames = new TreeMap<>();
        sortedMapOfNames.putAll(mapOfPeople);
        System.out.println("TreeMap: " + sortedMapOfNames);
    }
}
