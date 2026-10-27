package mod5_collections.lesson55_map

fun main() {
    val mapOfPeople = mutableMapOf<String, Int>()

    mapOfPeople["Kostya"] = 47
    mapOfPeople["Katya"] = 35
    mapOfPeople["Max"] = 43
    println(mapOfPeople)

    for ((name, age) in mapOfPeople) {
        println("name: $name, age: $age")
    }

    mapOfPeople.forEach { entry ->
        println("${entry.key} = ${entry.value}")
    }
}