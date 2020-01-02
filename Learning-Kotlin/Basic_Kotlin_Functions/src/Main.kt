// 1st custom function
fun getGreeting(): String {
    return "Hello Kotlin v1"
}
// Greeting function v2
fun getGreetingv2(): String = "Hello Kotlin v2"

// Greeting function v3
fun getGreetingv3() = "Hello Kotlin v3"

// function that can return null as a string value
fun getNull(): String? {
    return null
}
// function that returns a non-specific Unit data type
fun getUnit(): Unit {
    return Unit
}
// create a basic greeting
fun sayHello() {
    println(getGreeting())
}
// Basic default function
fun main() {
    println("Hello World")
    println(getGreeting())
    println(getGreetingv2())
    println(getGreetingv3())
    sayHello()
    getUnit()
    getNull()
}