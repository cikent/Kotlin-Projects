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
    // Give person a nickname
    person.nickName = "Inciter"

    //
    person.printInfo()
}