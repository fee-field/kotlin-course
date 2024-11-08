package com.feefield.kotlincourse.lesson019.homework

class SlotMachine(
    val color: String,
    val model: String,
    private var isOn: Boolean,
    private var isLoaded: Boolean,
    private val availableGames: MutableList<String>,
    val isGamePadPresent: Boolean,
    private var balance: Double = 0.0,
    val owner: String,
    val supportPhoneNumber: String = "+44 567 333 22"

    ) {
    fun turnOn() {
        isOn = true
    }
    fun turnOff() {
        isOn = false
    }
    fun loadOS() {
        if (isOn) {
            isLoaded = true
        } else {
            println("Turn on the slot machine first.")
        }
    }
    fun shutDownOS() {
        isLoaded = false
    }
    fun showGameList() : List<String> {
        println(availableGames)
        return availableGames
    }
    fun startGame(game: String) : Boolean {
        return game in availableGames
    }

    fun payForSession(amount: Double) : Double {
        balance += amount
        return balance
    }
    private fun openSafe() {

    }
    private fun issueCash(issuedCash: Double) : Double {
        openSafe()
        balance -= issuedCash
        return balance
    }
    fun payOut(amount: Double) : Double{
        openSafe()
        issueCash(amount)
        balance -= amount
        return balance
    }
}