fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// update greetPerson to utilize Default Parameter values if the function is executed w/o arguments
fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    // Execute greetPerson using Named Arguments
    greetPerson(greeting = "Hi", name = "Chris")
    // Execute greetPerson using Default Parameter Values
    greetPerson()

    // declare Array of Interesting Things
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    sayHello(itemsToGreet = *interestingThings, greeting = "Hi")
}