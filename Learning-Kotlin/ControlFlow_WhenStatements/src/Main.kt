// Define Top-level vars and vals
val name = "Chris"
var greeting: String? = null

// define the initial function
fun main() {
    // greeting = "Hello"
    when (greeting) {
        null -> println("Hi!")
        else -> println(greeting)
    }
    println(name)
}