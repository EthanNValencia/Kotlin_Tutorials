/*
#1
Topics covered here:
Variables and values,
if, else, when,
 */


/*
Top level variables are variables that are stated outside of a method body.
*/
var topLevelVariableExample: String = "This is a top level variable. It is not contained in a method body."

/*
In Kotlin, data types are non-nullable by default. To make a variable nullable, it must have a ? after the data type.
*/
var notNullable: String = "can't be null"
var nullable: String? = null // the ? allows the value to be null

fun main(){
    /*
    VAR are mutable/changeable variables.
    VAL are immutable/read-only variables.

    variable_type name: data_type = assignment
    */
    val immutable: String = "This is immutable"
    println(immutable)
    /*
    name = "update"
    This will not work, because name is a val and val is immutable.
    */
    var mutable: String = "This is mutable"
    println(mutable)
    mutable = "This is changed"
    println(mutable)
    /*
    If a variable is declared VAR (changeable), but it is never changed,
    then the IDE will recommend that it is made immutable.
    */
    println(topLevelVariableExample)
    topLevelVariableExample = "The top level variable has been changed." // The top level variable can be reassigned, because it is a var.
    println(topLevelVariableExample)

    println("If a the datatype doesn't have a ? after it, then " + notNullable)
    println("var nullable: String? = " + nullable)

    /*
    Control flow
    Kotlin has if and then statements like in Java.
    */
    var greeting: String? = null
    if (greeting != null){
        println("Greeting is not null.")
    } else if (greeting == null){
        println("Greeting is null: $greeting")
    }

    /*
    When statements are similar to switch statements in Java.
    */
    when (greeting) {
        null -> println("Greeting is null.")
        else -> println(greeting)
    }

    greeting = "Not null anymore"
    when (greeting) {
        null -> println("Greeting is null.")
        else -> println(greeting)
    }

    /*
    Kotlin can use control flow to assign variables.
    */
    greeting = "Not null"
    var greetingToPrint = if (greeting == null) greeting else "Hi" // greeting is not null, so it will assign "Hi" to greetingToPrint
    println(greetingToPrint)

    /*
    Using when statement to assign variables.
    */
    greetingToPrint = when (greeting) { // passing in greeting to the when method.
        null -> "Greeting is null." // if greeting is null, then this will be assigned to greetingToPrint.
        else -> "Greeting is not null." // if greeting is not null, then this will be assigned to greetingToPrint.
    }
    println(greetingToPrint)

}