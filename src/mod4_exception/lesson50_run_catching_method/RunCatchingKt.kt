package mod4_exception.lesson50_run_catching_method

fun main() {
    runCatching {
        val arr = arrayOf(4, 8, 15, 18, 23, 41)
        arr[5]
    }.onSuccess {
        println("Result: $it")
    }.onFailure {
        println("Exception: $it")
    }


}