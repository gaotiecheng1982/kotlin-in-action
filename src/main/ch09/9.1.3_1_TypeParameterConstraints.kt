package main.ch09.ex1_3_1_TypeParameterConstraints

fun <T : Int> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun main(args: Array<String>) {
    var inputArgument:Int = 0
    var a:Number = oneHalf(inputArgument)

    println(oneHalf(3))


}
