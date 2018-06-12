// Constants & Variable declaration
val x: Double = 10.0
val y: Double = 5.0

fun main(args: Array<String>) {
    println("Average of $x, $y is " + avg(x, y))
}

// Defining functions
fun avg(a: Double, b: Double) : Double {
    return (a + b)/2
}