fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    // define an list of Strings
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")

    // define a map of 'Key to Value' pairs
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    // iterate over the map
    map.forEach { key, value -> println("$key -> $value") }
}