package mod5_collections.lesson56_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queueNames = new PriorityQueue<>();
        queueNames.offer("Alice");
        queueNames.offer("Bob");
        queueNames.offer("Charlie");

        System.out.println(queueNames);

        String firstElement = queueNames.poll();
        String secondElement = queueNames.poll();
        String thirdElement = queueNames.poll();
        System.out.println("First element: " + firstElement);
        System.out.println("Second element: " + secondElement);
        System.out.println("Third element: " + thirdElement);

        System.out.println(queueNames);
    }
}
