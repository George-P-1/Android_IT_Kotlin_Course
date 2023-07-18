/**
 * Classes
 * Types - Regular, Data, Enum (constant), sealed, abstract, inner, open
 * Inheritance
 */

data class TestData (val name : String, var age : Int) {}

enum class TestEnum () {}

sealed class TestSealed () {}

abstract class TestAbstract () {}

class Test (private val nameConstructor : String)
{
    inner class TestInner () {}

    fun print(message : String)
    {
        println(message)
    }

    val name = nameConstructor

}

open class BaseClass(x: Int)

class DerivedClass(x: Int) : BaseClass(x)


// Main Function ---------------------------------------------------------------
fun main()
{
    val obj = Test("Peter")
    obj.print("Print this message.")
    println(obj.name)
}
