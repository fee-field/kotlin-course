package com.feefield.kotlincourse.lesson021.homework

//Напишите интерфейс Validator<T>, который будет проверять значение типа T на соответствие
// определенным условиям и возвращать булево значение (успешная или неуспешная проверка).

interface Validator<T> {
    fun validator(value: T) : Boolean
}