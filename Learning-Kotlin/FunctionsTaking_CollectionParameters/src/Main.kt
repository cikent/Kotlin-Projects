fun sayHello(greeting: String, itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    // define a immutable list of Strings
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    // use sayHello function and pass in the List as a parameter
    sayHello(greeting = "Hi", itemsToGreet = interestingThings)
}