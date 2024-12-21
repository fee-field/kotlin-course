package com.feefield.kotlincourse.lesson030.homework

//Задание 1
//Создай Enum со статусами прохождения теста (pass, broken, failure).
//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.
//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и
// вес планеты.

enum class Statuses(val description: String) {
    PASSED("Test is passed"),
    FAILED("Test is failed"),
    BROKEN("Test is n/a"),
}

enum class Property(val description: String) {
    APARTMENT("That's an apartment"),
    VILLA("For those with money"),
    SHARED_ROOM("For those without money"),
    HOUSE("For introverts"),
    BOAT("For those in Amsterdam")
}

enum class SolarSystem(val distance: Double, val weight: Double) {
    MERCURY(0.39, 3.3011e23),
    VENUS(0.72, 4.8675e24),
    EARTH(1.0, 5.97237e24),
    MARS(1.52, 6.4171e23),
    JUPITER(5.2, 1.8982e27),
    SATURN(9.58, 5.6834e26),
    URANUS(19.18, 8.6810e25),
    NEPTUNE(30.07, 1.02413e26);
}

//Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов недвижимости в порядке
// возрастания длины названия enum.

fun propertyFun() {
    Property.entries
        .sortedBy {
            it.name.length
        }.forEach {
            println(it.description)
        }
}

//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и
// возвращает Enum со статусом прохождения теста в зависимости от того как выполнится
// принятая лямбда. Если без исключений - pass, если будет AssertionError - failure, прочие
// исключения  - broken.

fun tests(lambda: () -> Unit): Statuses {
    return try {
        lambda()
        Statuses.PASSED
    } catch (e: AssertionError) {
        Statuses.FAILED
    } catch (e: Exception) {
        Statuses.BROKEN
    }
}

//Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты. Лямбда должна принимать
// планету и возвращать булево значение. Лямбда здесь выступает в качестве фильтра, который
// должен отфильтровать список всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если
// список пустой.

fun planets(lambda1: (SolarSystem) -> Boolean): SolarSystem {
    return SolarSystem.entries.firstOrNull(lambda1)
        ?: throw ArrayIndexOutOfBoundsException("List is null")
}

fun main() {
    propertyFun()
    println(planets { it.name.startsWith("M") })
//    println("planet found: ${}")

}
