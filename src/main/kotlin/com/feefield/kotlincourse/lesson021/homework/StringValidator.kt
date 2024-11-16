package com.feefield.kotlincourse.lesson021.homework

//Создай класс StringValidator и имплементируй интерфейс Validator с типом String?. Реализуй проверку,
// что строка не является null, не пустая и не состоит из одних пробелов.


class StringValidator : Validator<String?>
{
    override fun validator(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}