package main.ch03.ex5_3_MultilineTriplequotedStrings

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
    var a="s"
    val price = """${'$'}99.9    ${a}99.9"""
    println(price)
}
