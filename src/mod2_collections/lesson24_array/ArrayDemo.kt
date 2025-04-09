package mod2_collections.lesson24_array

fun main() {
    val arrNums: Array<Int> = arrayOf(21, 29, 38, 24, 35, 60, 73, 18, 9, 10)
    val arrNums1 = IntArray(10)
    arrNums1[0] = 21
    arrNums1[1] = 29
    arrNums1[2] = 38
    arrNums1[3] = 24
    arrNums1[4] = 35
    arrNums1[5] = 60
    arrNums1[6] = 73
    arrNums1[7] = 18
    arrNums1[8] = 9
    arrNums1[9] = 10
    println("The size of arrNumbs1 is ${arrNums1.size}.")

    for(num in arrNums1) {
        print("$num ")
    }
}