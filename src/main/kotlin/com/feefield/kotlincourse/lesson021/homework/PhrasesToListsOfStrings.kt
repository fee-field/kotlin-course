package com.feefield.kotlincourse.lesson021.homework

//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из
// полученных слов.

class PhrasesToListsOfStrings : Mapper <String, List<String>> {
    override fun transform(typeT: String): List<String> {
        return typeT.split(" ")

    }

    override fun transformTtoR(typeT: List<String>): List<List<String>> {
        return typeT.map { it.split(" ")}
    }

}