package mod5_collections.lesson56_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleEndedQueueDemo {
    public static void main(String[] args) {
        Deque<String> dequeNames = new ArrayDeque<>();
        dequeNames.addFirst("Alice");
        dequeNames.addLast("Bob");
        dequeNames.addLast("Charly");

        System.out.println(dequeNames);

        String firstName = dequeNames.removeFirst();
        String lastName = dequeNames.removeLast();

        System.out.println("First element: " + firstName);
        System.out.println("Last element: " + lastName);
        System.out.println(dequeNames);

        String first = dequeNames.getFirst();
        String last = dequeNames.getLast();
        System.out.println("First - " + first);
        System.out.println("Last - " + last);
        System.out.println(dequeNames);

    }
}
