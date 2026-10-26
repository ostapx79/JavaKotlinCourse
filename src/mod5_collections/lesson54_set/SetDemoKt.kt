package mod5_collections.lesson54_set

fun main() {
    val namesList = mutableListOf("Kostya", "Max", "Katya", "Kostya", "Anna", "Zacka")

    println("list of names: $namesList")

    val setOfNames = namesList.toSet()
    println("set of names: $setOfNames")

    val sortSetOfNames = mutableSetOf("Kostya", "Max", "Katya", "Kostya", "Anna", "Zacka")
    sortSetOfNames += ("Masha")
    sortSetOfNames.add("Vasya")

    println("sort set of names: ${sortSetOfNames.toSortedSet()}")

}