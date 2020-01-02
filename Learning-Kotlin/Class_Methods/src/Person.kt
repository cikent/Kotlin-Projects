// include property declarations within the Primary Constructor
class Person(val firstName: String = "Tony", val lastName: String = "Stark") {
    // define a new property for the Person Class
    var nickName: String? = null
        // When this property is Set to a new value, execute this block
        set(value) {
            // make the field update to the value set
            field = value
            // print a line to console verifying the value has been set for debug
            println("the new nickname is $value")
        }

        // When this property is accessed, execute this block
        get() {
            println("the return value is $field")
            return field
        }

    fun printInfo() {
        println("$firstName ($nickName) $lastName")
    }
}