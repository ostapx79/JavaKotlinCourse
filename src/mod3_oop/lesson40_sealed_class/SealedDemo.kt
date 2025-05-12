package mod3_oop.lesson40_sealed_class

fun main() {
    val loadingResult:Result = Result.Loading
    val successResult:Result = Result.Success("Downloaded 28/30")
    val errorResult:Result = Result.Error("error code : 404")

    handleResult(loadingResult)
    handleResult(successResult)
    handleResult(errorResult)
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Error -> println("Error: ${result.msg}")
        is Result.Loading -> println("Loading...")
        is Result.Success -> println("Success: ${result.info}")
    }
}