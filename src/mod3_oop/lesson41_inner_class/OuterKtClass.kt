package mod3_oop.lesson41_inner_class

class OuterKtClass {
    private var outerField: Int = 0

    fun outerMethod() {
        println("Outer Method")
    }

    inner class InnerKtClass {
        private val innerField: Int = 0

        fun innerMethod() {
            outerField = 100
            println("Inner Method, outerField = $outerField")
            this@OuterKtClass.outerMethod()
        }
    }
}