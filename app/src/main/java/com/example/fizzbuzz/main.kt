package com.example.fizzbuzz

fun main(){
    print("Hello World!")

    for (i in 1..100) {
        checkFizzBuzz(i)
    }

}

fun checkFizzBuzz(x: Int) {
    if (x % 3 == 0 && x % 5 == 0) {
        println("FizzBuzz")
    } else if (x % 3 == 0) {
        println("Fizz")
    } else if (x % 5 == 0) {
        println("Buzz")
    } else {
        println(x)
    }
}