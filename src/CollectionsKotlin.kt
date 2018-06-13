
/**
 * Created by Rajkumar B on 13-06-2018.
 */
fun main(args: Array<String>) {
    val theMutableList = mutableListOf("one", "two", "three","four", "five")
    println("First Element "+theMutableList.first())
    println("Last Element "+theMutableList.last())
    println("Filtered Element "+theMutableList.filter { it.contains("w") })
    println("Fourth Element "+theMutableList.find { it.length == 4 })
    theMutableList.sort()
    println("The sorted values")
    for(item in theMutableList){
        println(item)
    }
}