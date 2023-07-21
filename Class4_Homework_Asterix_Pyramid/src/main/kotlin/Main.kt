fun main()
{
    // Homework -----------------
    printPyramid(5)

    // Extra --------------------
    //printRightTriangleLeft(5)
    //printRightTriangleRight(5)
}

/**
 * Prints an asterix pyramid (with odd number of asterix in each row)
 *
 * Output:
 * ```
 *   *      |
 *  ***     | <-- height = 3
 * *****    |
 * ```
 * @param height Number of rows of the asterix pyramid
 */
fun printPyramid(height : Int)
{
    val base : Int = (height * 2) - 1
    for(row in 0..<height)
    {
        for(column in 1..(base/2)-row)
        {
            print(" ")
        }
        for(column in 1..row*2+1)
        {
            print("*")
        }
        print("\n")
    }
}

/**
 * Prints right-angled triangle (with angle on the left)
 *
 * Output:
 * ```
 * *
 * **
 * ***
 * ****
 * *****      <-- base
 * ```
 * @param base Number of asterix in the bottom row
 */
fun printRightTriangleLeft(base : Int)
{
    for(row in 1..base)
    {
        for(column in 1..row)
        {
            print('*')
        }
        print("\n")
    }
}

/**
 * Prints right-angled triangle (with angle on the right)
 *
 * Output:
 * ```
 *     *
 *    **
 *   ***
 *  ****
 * *****     <-- base
 * ```
 * @param base Number of asterix in the bottom row
 */
fun printRightTriangleRight(base : Int)
{
    for(row in base downTo 1)
    {
        for(column in 1..base)
        {
            if(column < (row))
            {
                print(" ")
            }
            else
            {
                print("*")
            }
        }
        print("\n")
    }
}