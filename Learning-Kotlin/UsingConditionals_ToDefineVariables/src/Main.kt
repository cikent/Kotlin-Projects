// Define Top-level vars and vals
val name = "Chris"
var greeting: String? = null

// define the initial function
fun main() {
    greeting = "Hello"                                                   // optional input value
    // val greetingToPrint = if(greeting != null) greeting else "Hi"        // If conditional
    val greetingToPrint = when (greeting) {                                 // when conditional
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint)
    println(name)
}