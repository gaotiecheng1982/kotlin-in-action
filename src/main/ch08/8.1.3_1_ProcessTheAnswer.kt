@file:JvmName("ProcessTheAnswer")
package main.ch08.ProcessTheAnswer

/* Kotlin declaration */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}
