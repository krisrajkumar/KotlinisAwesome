/**
 * Created by Rajkumar B on 13-06-2018.
 */
fun main(args: Array<String>) {
    // List example
    val theMutableList = mutableListOf("one", "two", "three", "four", "five")
    println("First Element " + theMutableList.first())
    println("Last Element " + theMutableList.last())
    println("Filtered Element " + theMutableList.filter { it.contains("w") })
    println("Fourth Element " + theMutableList.find { it.length == 4 })
    theMutableList.sort()
    println("The sorted values")
    for (item in theMutableList) {
        println(item)
    }
    val firstList = mutableListOf(1, 2, 3, 4, 5)

    println("Max: "+firstList.max())
    println("Min: "+firstList.min())
    println("Sum: "+firstList.sum())
    println("Take: "+firstList.take(2))
    println("TakeLast: "+firstList.takeLast(2))
    println("Slice "+firstList.slice(listOf(2,4)))

    val secondList = mutableListOf(6, 7, 8, 9, 10)
    val thirdList = firstList + secondList
    println("Plus: "+thirdList.sorted())
    println("Drop: "+thirdList.dropLast(2))

    // Array Example
    var fruit = arrayOf("Banana", "Kiwifruit", "Mango", "Apple")
    fruit += "Pear"
    println("Arrays of fruits")
    println(fruit.toList())

    // Map Example
    val numMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3, "Four" to 4)
    println(numMap)

    // Change a existing entry in the map.
    numMap["Two"] = 22
    println(numMap)

    // Remove a entry from the map by key.
    numMap.remove("Four")
    println(numMap)

    // Add a entry to the map.
    numMap["Three"] = 333
    println(numMap)
}