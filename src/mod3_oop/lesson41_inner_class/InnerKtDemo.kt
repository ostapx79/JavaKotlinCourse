package mod3_oop.lesson41_inner_class

fun main() {
    val outerKtClass: OuterKtClass = OuterKtClass()
    outerKtClass.outerMethod()

    val innerKtClass = outerKtClass.InnerKtClass()
    innerKtClass.innerMethod()
}