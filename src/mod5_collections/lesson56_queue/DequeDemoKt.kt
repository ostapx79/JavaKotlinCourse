package mod5_collections.lesson56_queue

import java.util.ArrayDeque
import java.util.Deque

fun main() {
    val dequeNames: Deque<String> = ArrayDeque()
    dequeNames.addFirst("Kostya")
    dequeNames.addLast("Katya")
    dequeNames.addLast("Anna")

    println(dequeNames)

    val firstName = dequeNames.removeFirst()
    val lastName = dequeNames.removeLast()
    println("First element: $firstName")
    println("Last element: $lastName")
    println(dequeNames)

    val first = dequeNames.first
    val last = dequeNames.last
    println("First = $first")
    println("Last = $last")
    println(dequeNames)
}