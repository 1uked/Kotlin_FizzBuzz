package com.example.fizzbuzz

fun main(){
    // TODO: Implement Recursive
    print("Enter an Upper Limit: ")
    val stringInput = readLine()!!

    try {
        for (i in 1..stringInput.toInt()) {
            checkFizzBuzz(i)
        }
    } catch (e: NumberFormatException) { }
}

fun checkFizzBuzz(x: Int) {
    var output = emptyArray<String>()

    if (x % 3 == 0) { output += "Fizz" }

    if (x % 13 == 0) { output += "Fezz" }

    if (x % 5 == 0) { output += "Buzz" }

    if (x % 7 == 0) { output += "Bang" }

    if (x % 11 == 0) {
        if (x % 13 == 0) {
            output = arrayOf("Fezz","Bong")
        } else { output = arrayOf("Bong") }
    }

    if (x % 17 == 0) { output.reverse() }
    printOutput(x, output)
}

fun printOutput(x : Int, y : Array<String>){
    if (y.size != 0) {
        println(y.joinToString(separator = ""))
    } else {
        println(x)
    }
}