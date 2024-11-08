package com.feefield.kotlincourse.classWork.lesson019

private const val CONST = "const"

open class Person(private val name: String, protected val age: Int) {

    // Публичный метод
    fun greet() {
        println("Привет, меня зовут $name.")
    }

    // Защищённый метод
    protected fun getName(): String {
        return name
    }

    // Приватный метод
    private fun secret() {
        CONST
        println("Это секретный метод.")
    }
}