package com.example.fizzbuzz

fun main(){
    for (i in 1..100) {
        checkFizzBuzz(i)
    }
}

/*
* Rule 1 : %3 and %5
* Rule 2 : %3 || %5 and %7
* Rule 3 : %3
* Rule 4 : %5
* Rule 5 : %7
* Rule 6 : %11 - Priority
* Rule
* */

fun checkFizzBuzz(x: Int) {
    var output = emptyArray<String>()

    if (x % 3 == 0) {
        output += "Fizz"
    }

    if (x % 5 == 0) {
        output += "Buzz"
    }

    if (x % 7 == 0) {
        output += "Bang"
    }

    if (x % 11 == 0) {
        output = arrayOf("Bong")
    }

    printOutput(x, output)
}

fun printOutput(x : Int, y : Array<String>){
    if (y.size != 0) {
        println(y.joinToString(separator = ""))
    } else {
        println(x)
    }
}