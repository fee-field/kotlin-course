package com.feefield.kotlincourse.lesson015.homeWork015

class Concert(
    val band: String,
    val location: String,
    val price: Double,
    val capacity: Int,

    ) {
    private var ticketsSold = 0
    fun info() {
        println("The concert info is: $location, $band, $price, $capacity, $ticketsSold.")
    }
    fun butTicket() {

        if(ticketsSold < capacity) {
            ticketsSold++
        } else {
            println("All tickets are sold")
        }

    }
}