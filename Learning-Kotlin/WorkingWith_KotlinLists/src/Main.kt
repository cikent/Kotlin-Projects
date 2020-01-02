fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    // define an List of Strings
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.get(0))
    println(interestingThings[0])

    // forEach example for iterating over the elements in the List
    interestingThings.forEach{ interestingThing ->
        println(interestingThing)
    }
}