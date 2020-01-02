// include property declarations within the Primary Constructor
class Person(val firstName: String, val lastName: String) {

    // called 1st when the Class is instantiated
    init {
        println("Init 1")
    }

    // secondary constructor; allows an alternative way to instantiate the Class
    constructor(): this("Tony", "Stark") {
        println("secondary constructor")

    }

    // called 2nd when the Class is instantiated
    init {
        println("Init 2")
    }
}