package mod4_exception.lesson50_run_catching_method

fun main() {
    val result = runCatching {
        val numerator = 10
        val denominator = 2
        numerator / denominator
    }

    if (result.isSuccess) {
        val value = result.getOrNull()
        println("Result: $value")
    } else {
        val exception = result.exceptionOrNull()
        println("Exception: $exception")
    }
}