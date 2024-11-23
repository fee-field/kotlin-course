package com.feefield.kotlincourse.lesson024.homework

fun main() {

    //task 04
    //Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от
    // AssertionError и принимающий текст. Выброси это исключение в main

    try {
        throw MyAssertionError("That's my custom assertion error")
    } catch (e: AssertionError) {
        println("That's AssertionError")
    }


    //task 05
    //Задание 5. Создай свой тип исключения в отдельном файле, наследуемый от
    // RuntimeException и принимающий ArrayIndexOutOfBoundsException тип в
    // качестве аргумента. Напиши код, который спровоцирует выброс
    // ArrayIndexOutOfBoundsException, перехвати его с помощью try-catch и в
    // блоке catch выведи сообщение в консоль и сделай выброс своего типа
    // исключения.

    try {
        val taskFive = listOf(5,6,7)
        taskFive[8]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("The first is ArrayIndexOutOfBoundsException")
        throw MyRuntimeException(e)
    }


}