package com.feefield.kotlincourse.lesson018.homework

abstract class Animal() {
    abstract fun makeSound()

    protected fun makeSound (sound: String, color: String){
        println("This animal makes no sound.")
    }
}