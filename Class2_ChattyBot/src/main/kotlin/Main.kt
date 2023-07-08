/**
 * Chatty Bot
 *       ~ It's not really a bot. It's more like a fixed-flow unilateral sequential chat prompt.
 *
 * @author George
 * @since v0.5
 */

import java.util.Scanner

val scanner = Scanner(System.`in`)

// Main Function --------------------------------------------------------------------------------------
fun main()
{
    greet("Chatty bot", "2023")
    remindName()
    guessAge()
//    count()
//    test()
}

// Functions --------------------------------------------------------------------------------------

/**
 * **Greets the user.**
 *
 * @param assistantName Name of the "bot"
 * @param birthYear Year of creation of "bot"
 */
fun greet(assistantName : String = "--'Bot' Name--", birthYear : String = "--'Bot' Creation Year--")
{
    println("\nHello! My name is $assistantName.\nI was created in $birthYear.")
}

/**
 * **Gets user's name.**
 */
fun remindName()
{
    println("Please, remind me of your name.")
    val name = scanner.next()
    println("What a great name you have, $name!")
}

/**
 * **Computes user age** using the *Chinese Remainder Theorem*, by only using
 * moduli of user's age with divisors 3, 5 and 7.
 */
fun guessAge()
{
    println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.")
    print("Remainder with divisor 3: ")
    val rem3 = scanner.nextInt()
    print("Remainder with divisor 5: ")
    val rem5 = scanner.nextInt()
    print("Remainder with divisor 7: ")
    val rem7 = scanner.nextInt()

    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age. That's a good time to start programming!")
}
