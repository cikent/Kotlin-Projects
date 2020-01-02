// Define Top-level vars and vals
val name = "Chris"
var greeting: String? = null

// define the initial function
fun main() {
    if (greeting != null){
        println(greeting)
    } else {
        println("Hi!")
    }
    println(name)
}