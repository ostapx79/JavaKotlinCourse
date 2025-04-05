package syntax.lesson19_fun

fun main() {
    println("The sum of first 10 numbers is ${getSumOfNumbers(10)}")
    println("The sum of first 999 numbers is ${getSumOfNumbers(999)}")
    println("The sum of first 25 numbers is ${getSumOfNumbers(25)}")
    println("The sum of first 999999999 numbers is ${getSumOfNumbers(999999999)}")

    println("The sum of first 10 numbers is ${getSumNum(10)}")
    println("The sum of first 999 numbers is ${getSumNum(999)}")
    println("The sum of first 25 numbers is ${getSumNum(25)}")
    println("The sum of first 999999999 numbers is ${getSumNum(999999999)}")

    displayShow()

    println("The sum of numbers 15 and 35 is ${getSumOfTwoNumbers(15, 35)}")
    println("The sum of numbers 37 and 23 is ${getSumOfTwoNumbers(37, 23)}")


}

fun getSumOfNumbers(number:Int = 1): Long {
    var count = 0
    var sum = 0L
    while(count <= number) {
        sum += count
        count++
    }
    return sum
}

fun getSumNum(number: Int): Long {
    var sum = 0L
    for(i in 0..number) {
        sum += i
    }
    return sum
}

fun displayShow() {
    println("Hello, Kotlin!")
}

fun getSumOfTwoNumbers(a: Int, b: Int) = (a + b).toLong()