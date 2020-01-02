fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    // define a immutable list of Strings
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")

    // define a mutable list of Strings
    val interestingThingsv2 = mutableListOf("Kotlin", "Programming", "Comic Books")
    // add another element to the List
    interestingThingsv2.add("Dogs")

    // define a immutable map of 'Key to Value' pairs
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    // define a mutable map of 'Key to Value' pairs
    val mapv2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")

    // add another element to the Map
    mapv2.put(4, "d")

    // iterate over the List and Map's
    interestingThingsv2.forEach { interestingThing -> println(interestingThing) }
    mapv2.forEach { key, value -> println("$key -> $value") }
}