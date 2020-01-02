fun sayHello(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach {itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun main() {
    // Because the Parameters being passed are associated with the Argument "Names", order doesn't matter
    greetPerson(name = "Chris", greeting = "Hi")
}