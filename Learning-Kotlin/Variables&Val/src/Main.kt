// Move the variable declaration outside of the main function to make it a Top-level variable
val name: String = "Chris"
// var name: String? = null             // null declaration
var greeting: String? = null

fun main() {
    println(greeting)
    println(name)

    greeting = null
    greeting = "Hello"

    println(greeting)
    println(name)
}