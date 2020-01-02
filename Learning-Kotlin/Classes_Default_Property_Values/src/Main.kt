// basic function for to say Hello
fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// update greetPerson to utilize Default Parameter values if the function is executed w/o arguments
fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    // create an instance of the Class Person
    val person = Person("Chris", "Kent")
    // create an instance of the Class Person without using parameters; utilizing the default property values
    val person2 = Person()

    // Print Class properties for Person1
    println(person.firstName + " " + person.lastName)
    // Print Class properties for Person2
    println(person2.firstName + " " + person2.lastName)
}