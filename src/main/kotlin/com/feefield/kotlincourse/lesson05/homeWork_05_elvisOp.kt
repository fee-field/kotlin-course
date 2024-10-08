package com.feefield.kotlincourse.lesson05

//Оператор элвиса
//
//Задание выполняется в виде функций, принимающих один или более аргументов. Все функции должны быть вызваны из функции main()
// в вариантах с null и с вещественным значением.


//Контекст: Вы изучаете физическое явление затухания звука в помещении. У вас есть измеренное значение начальной интенсивности
// звука, но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.

//Задача 1: Рассчитать предполагаемую интенсивность звука после затухания. Интенсивность звука после затухания пропорциональна
// начальной интенсивности, умноженной на коэффициент затухания. Если коэффициент затухания неизвестен, использовать стандартное
// значение 0.5.

//Контекст: Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз, которая составляет 0,5%
// от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50
//Задача 2: Рассчитать полную стоимость доставки.

//Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
// которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
// Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.


fun main(){

// Задача 1: Рассчитать предполагаемую интенсивность звука после затухания.
    soundIntencity(30.0, 0.9)
    soundIntencity(30.0, null)

// Задача 2: Рассчитать полную стоимость доставки.
    totalCosts(500.0)
    totalCosts(null)

//Задача 3: Cообщить об ошибке в случае отсутствия показаний атмосферного давления.
    printError(null)
    printError("500")
}

//Задача 1: Рассчитать предполагаемую интенсивность звука после затухания.

fun soundIntencity(initIntencity: Double, coef: Double?) {
//    val initIntencity = 20.00
//    val coef = 0.8
    val estIntencity = initIntencity * (coef ?: 0.5)
    println(estIntencity ?: 0.5)
}

//Задача 2: Рассчитать полную стоимость доставки.

fun totalCosts(costs: Double?) {
    val defCost = 50
    val initInsur = (costs?:defCost * 0.5)/100
    val totalCost = costs?:defCost + initInsur
    println(totalCost)

}

//Задача 3: Cообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun printError(airPress: String?) {
    airPress?: throw Exception("Missing readings")
    println(airPress)
}