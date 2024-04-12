package com.ehsannarmani.algoritm

fun staircase(){
    print("Enter the count of staircases: ")
    val stairs = readln().toInt()

    val ways = countWays(stairs)
    println("")
    println("All possible ways: $ways")

}
fun countWays(n: Int, path: String = ""): Int {
    if (n < 0) return 0
    if (n == 0) {
        println(path)
        return 1
    }

    return countWays(n - 1, "$path Hop 1,") + countWays(n - 2, "$path Hop 2,") + countWays(n - 3, "$path Hop 3,")
}