package mod5_collections.list

fun main() {
    val names = mutableListOf("Kostya", "Tolya")

    println(names)

    names.add(0, "Katya")
    names[2] = "Anna" // set(2, "Anna")
//    names.set(2, "Max")
//    println("The first element is ${names.get(2)}")

    println("The first element is ${names[0]}") // get(0)
    println(names)

    names.removeIf { str -> str.startsWith("A") }
    println(names)
}
