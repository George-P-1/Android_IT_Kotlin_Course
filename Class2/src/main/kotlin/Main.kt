import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
//    println("Hello World!")
//
//    printHello()

//    birthdayGreeting()

//    val greeting = get_birthdayGreeting("Emin", 20)
//    println(greeting)
//    println(get_birthdayGreeting(age=96))

    val name = scanner.next() // Scans for string
    println(get_birthdayGreeting(name, age=96))



}

// Function declaration without return type
fun printHello ()
{
    println("Hello")
}

// Function declaration with Unit (void) return type
fun birthdayGreeting() : Unit // Unit is like void in C/C++. Unit is the return type
{
    println("Happy Birthday, Emin!")
}

// Function declaration with String return type, and two input parameters
fun get_birthdayGreeting(name : String = "Nobody", age : Int = 0) : String
{
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years away from birth but also closer to death."

    return "$nameGreeting\n$ageGreeting"
}





