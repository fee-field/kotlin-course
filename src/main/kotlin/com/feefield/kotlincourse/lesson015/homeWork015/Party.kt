package com.feefield.kotlincourse.lesson015.homeWork015


//Событие: Вечеринка Создайте класс Party, который описывает вечеринку. У него должны быть свойства location (String) и attendees (Int).
// Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

class Party (
    val location: String,
    val attendees: Int
)
{
    fun details() {
        println("Party address: $location, the following are invited: $attendees")
    }
    }