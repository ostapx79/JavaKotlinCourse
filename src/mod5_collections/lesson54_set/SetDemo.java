package mod5_collections.lesson54_set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Kostya");
        namesList.add("Kostya");
        namesList.add("Max");
        namesList.add("Katya");
        System.out.println("list of names: " + namesList);

        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Helen");
        setOfNames.addAll(namesList);
        System.out.println("set of names: " + setOfNames);

        Set<String> sortedSetOfNames = new TreeSet<>();
        sortedSetOfNames.add("Zacka");
        sortedSetOfNames.addAll(setOfNames);
        sortedSetOfNames.add("Anna");
        System.out.println("sorted set of names: " + sortedSetOfNames);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.addAll(sortedSetOfNames);
        System.out.println("linked set of names: " + linkedSet);
    }
}
