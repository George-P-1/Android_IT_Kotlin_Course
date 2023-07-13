/**
 * Homework - Reverse number
 */

fun main()
{
    val number = 12345
    println(shortReverse(number))

    println(getReverse(12345))
    println(getReverse(115599))
    println(getReverse(5))
    println(getReverse(-112233))
}

/**
 * Returns reversed integer of **positive integers** *using built-in functions*.
 */
fun shortReverse(number: Int) : Int
{
    return number.toString().reversed().toInt()
}

/**
 * Returns reversed integer of **positive & negative integers**
 */
fun getReverse(number : Int) : Int
{
    var num : Int = 0
    if (number < 0)                 // If number is negative
    {
        num = -number
    }
    else                            // If number is positive or 0
    {
        num = number
    }
    // Reverse the integer ----------
    if (num in 1..8)
    {
        return num
    }
    var reversedInt : Int = 0
    while (num > 0)
    {
        // move to next digit and then add last digit to the reverse variable
        reversedInt = (reversedInt * 10) + (num%10)
        num /= 10                                                   // Remove the last digit from full number
    }
    if (number < 0)
    {
        return -reversedInt
    }
    return reversedInt
}
