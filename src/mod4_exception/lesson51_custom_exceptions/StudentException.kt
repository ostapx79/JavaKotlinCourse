package mod4_exception.lesson51_custom_exceptions

class StudentException : Exception {
    constructor() : super()
    constructor(msg: String) : super(msg)
}