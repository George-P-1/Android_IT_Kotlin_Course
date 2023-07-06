import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {

    println("How many steps did you go today?")
    val steps = scanner.nextInt()

    calcCalories(steps)

    println("How many steps was your goal?")
    val stepsGoal = scanner.nextInt()

    calcStepsLeft(steps, stepsGoal)
}

fun calcCalories(steps : Int)
{
    val calories = 0.04 * steps
    println("Congrats! You burnt ${calories} calories.")
}

fun calcStepsLeft(steps : Int, stepsGoal : Int)
{
    println("So close you needed just ${stepsGoal-steps} more steps.")
}


