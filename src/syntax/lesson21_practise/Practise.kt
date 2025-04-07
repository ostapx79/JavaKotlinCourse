package syntax.lesson21_practise

fun main() {

    println("The winner is ${getWinner(300, 350, 450, 490)}!")

}

fun getWinner(
    gryffindorPoint:Int,
    slytherinPoints:Int,
    ravenclawPoints:Int,
    hufflepuffPoints:Int
): String {
    return if (
        gryffindorPoint > slytherinPoints
        && gryffindorPoint > ravenclawPoints
        && gryffindorPoint > hufflepuffPoints) {
        "Gryffindor"
    } else if (
        slytherinPoints > ravenclawPoints
        && slytherinPoints > hufflepuffPoints
        && slytherinPoints > gryffindorPoint) {
        "Slytherin"
    } else if (
        ravenclawPoints > gryffindorPoint
        && ravenclawPoints > slytherinPoints
        && ravenclawPoints > hufflepuffPoints) {
        "Ravenclaw"
    } else {
       "Hufflepuff"
    }
}