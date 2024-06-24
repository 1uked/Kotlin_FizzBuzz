package com.example.fizzbuzz

fun main(){
    for (i in 1..300) {
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
* Rule 7 : %13
* Rule 8 : %17 Reverse
* */

fun checkFizzBuzz(x: Int) {
    var output = emptyArray<String>()

    if (x % 3 == 0) {
        output += "Fizz"
    }

    if (x % 13 == 0) {
        output += "Fezz"
    }

    if (x % 5 == 0) {
        output += "Buzz"
    }

    if (x % 7 == 0) {
        output += "Bang"
    }

    if (x % 11 == 0) {
        if (x % 13 == 0) {
            output = arrayOf("Fezz","Bong")
        } else {
            output = arrayOf("Bong")
        }
    }

    if (x % 17 == 0) {
        output.reverse()
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