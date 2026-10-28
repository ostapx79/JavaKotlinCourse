package mod5_collections.lesson56_queue

import java.util.PriorityQueue

fun main() {
    val queueNames = PriorityQueue<String>()
    queueNames.offer("Aslan")
    queueNames.offer("Alice")
    queueNames.offer("Bob")
    queueNames.offer("John")

    println(queueNames)

    queueNames.poll()
    println(queueNames)
}