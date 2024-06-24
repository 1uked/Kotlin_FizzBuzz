package com.example.fizzbuzz

fun main(){
    // TODO: Implement Recursive + Validation
    print("Enter an Upper Limit: ")
    val stringInput = readLine()!!

    val validRules = arrayOf("3","5","7","11","13","17")
    var curRules = emptyArray<String>()

    for (i in validRules) {
        println("Would you like to use rule '$i': (y/n)")
        var stringAns = readLine()!!
        if (stringAns == "y") {
            curRules += i
        }
    }

    try {
        for (i in 1..stringInput.toInt()) {
            println(checkFizzBuzz(i,curRules))
        }
    } catch (e: NumberFormatException) { }
}

fun checkFizzBuzz(x: Int, Rules: Array<String>) : String {
    var output = emptyArray<String>()

    if (x % 11 == 0 && "11" in Rules) {
        return if (x % 13 == 0 && "13" in Rules) { "FezzBong" }
        else { "Bong" }
    }


    if (x % 3 == 0 && "3" in Rules) { output += "Fizz" }

    if (x % 13 == 0 && "13" in Rules) { output += "Fezz" }

    if (x % 5 == 0 && "5" in Rules) { output += "Buzz" }

    if (x % 7 == 0 && "7" in Rules) { output += "Bang" }

    if (x % 17 == 0 && "17" in Rules) { output.reverse() }

    return if (output.isNotEmpty()) {
        output.joinToString(separator = "")
    } else { x.toString() }
}
