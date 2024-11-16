package com.feefield.kotlincourse.lesson021.homework

//Напишите класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления и
// получения всех элементов.

class ListHolder <T> {
    val elements = mutableListOf<T>()

    fun addElements(elem: T) {
        elements.add(elem)
    }
    fun getElement() : List<T> {
        return elements
    }
}