fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    // define an array of Strings
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    print(interestingThings.get(0))
    println("")

    /*for (interestingThing in interestingThings) {
        println(interestingThing)
    }*/

    // implicit declaration
    /*interestingThings.forEach {
        println(it)
    }*/

    // explicit declaration             // this approach will lose the index reference information for the entity
    /*interestingThings.forEach {interestingThing ->
        println(interestingThing)
    }*/

    interestingThings.forEachIndexed { index, interestThing ->
        println("$interestThing is at index $index")
    }
}