package com.feefield.kotlincourse.classworks

//fun main() {
//    val sum = "10" + "5"
//    val isEqual = 5 == 4
//    val isNotEqual = 6 != 5
//
//    val andResult = true && false
//    val orResult = true || false
//    val notResult = !(5 > 3)
//
//    var number  = 5
//    number -= 2
//
//    println(number)

//        printVolume(25)
//
//    }
//
//    fun printVolume(userVolume: Int?) {
//        val defaultVolume = 30
//        println(userVolume ?: defaultVolume)
//    }

fun main() {
    printPrice(150.5, null)
    printPrice(150.5, 7)

}

    fun printPrice(price: Double, d: Int?){
        val koef = (100 -(d?:0))/100.0
        println(price * koef)
    }


