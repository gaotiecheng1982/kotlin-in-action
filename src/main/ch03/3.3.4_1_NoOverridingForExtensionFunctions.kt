package main.ch03.ex3_4_1_NoOverridingForExtensionFunctions

fun String.lastChar(): Char=this.get(this.length - 1)

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    print("China".lastChar())
}
