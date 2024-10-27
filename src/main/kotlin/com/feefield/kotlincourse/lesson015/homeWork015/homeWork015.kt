package com.feefield.kotlincourse.lesson015.homeWork015
fun main() {

//Событие: Вечеринка Создайте класс Party, который описывает вечеринку.
    val objectParty = Party("There", 16)
    objectParty.details()

//Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.

    val objectEmotion = Emotion("anger", 9)
    objectEmotion.express()


//Создайте объект Moon, который будет представлять Луну.

    val objectMoon = Moon(true, "Full Moon")
    val objectMoon1 = Moon(false, "New Moon")
    objectMoon.showPhase()
    objectMoon1.showPhase()

//Покупка: Продукт Создайте дата класс для продукта.

    val objectProduct = Product("Meat", 3.15, 2)
    println(objectProduct)

//Мероприятие: Концерт Создайте класс, который будет представлять концерт.

    val objectConcert = Concert("ABBA", "New York", 99.99, 5000)

    objectConcert.info()
    objectConcert.butTicket()
    objectConcert.info()
    objectConcert.butTicket()



}