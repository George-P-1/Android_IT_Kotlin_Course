fun main()
{
    /**
     * NULL Safety
     */
    var a : String? = "abc"

    a = null

    println(a)
    println(a?.length)
//    val l = a!!.length
//     println(l)

    /**
     * Arrays
     */
    val num = arrayOf(1,2,3,4)      // Mutable (Array)
    //val num = listOf(1,2,3,4)     // Immutable (List)
    val num1 = arrayOf<Int>(1,2,3,4)
    val str = arrayOf("a", "b", "c", "d")
    println(num[2])
    num[2] = 9
    println(num[2])
    println(num.size)

    val numbers = mutableListOf(1,2,3,4)    // Mutable (List)
    numbers.add(2,9)
    println(numbers)
    numbers.removeAt(3)
    println(numbers)
    numbers.addAll(3, listOf(4, 4, 4, 4))
    println(numbers)
    println(num.binarySearch(9))
    numbers.remove(4)
    println(numbers)
    numbers.replaceAll { 8 }
    println(numbers)

    /**
     * if condition
     */
    var trafficLightColor = "Green"

    if(trafficLightColor == "Red") println("STOP")
    else if (trafficLightColor == "Yellow") println("Slow")
    else if (trafficLightColor == "Green") println("Go")
    else println("Invalid Traffic Light Color")

    /**
     * when condition
     */
    trafficLightColor = "black"
    when (trafficLightColor)
    {
        "Red" -> println("STOP")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid Traffic Light Color")
    }

    val x = 5
    when (x)
    {
        2,3,4,5 -> println()
        in 1..10 -> println()
        is Int -> println()
        else -> println()
    }

    trafficLightColor = "Red"
    val message = when (trafficLightColor)
    {
        "Red" -> "STOP"
        "Green" -> "Go"
        else -> "Invalid Traffic Light Color"
    }

    /**
     * For loop
     */
    println("For loops")
    for (item in 1..5)
    {
        println(item)
    }
    for (item in 5 downTo 0)
    {
        println(item)
    }
    for (item in 16 downTo 1 step 3)
    {
        println(item)
    }

    /**
     * while loop
     */
    var b = 5
    println("While loop")
    while (b>0)
    {
        b--
        println(b)
    }

    do { /*do something*/ }
    while (b != 0)
    
}
