package mod1_syntax.lesson22_switch_when

fun getWinner(
    gryffindorPoints:Int, slytherinPoint:Int,
    ravenclawPoints:Int, hufflepuffPoints:Int
): String {
    val maxPoints = maxOf(gryffindorPoints, slytherinPoint, ravenclawPoints, hufflepuffPoints)

    return when (maxPoints) {
        gryffindorPoints -> "Gryffindor"
        slytherinPoint -> "Slytherin"
        ravenclawPoints -> "Ravenclaw"
        else -> "Hufflepuff"
    }
}