package com.ehsannarmani.algoritm

fun findMissingNumber() {
    print("Enter numbers and separate them with '-': ")
    val numbers = readln().split("-").map { it.trim().toInt() }

    val sorted = numbers.sorted()

    for (index in 0 until sorted.count()) {
        val number = sorted[index]

        if (number + 1 != sorted.getOrNull(index + 1) && index != sorted.lastIndex) {
            println("Missing number: ${number + 1}")
            return
        }
    }
    println("Your numbers have no missing number")
}