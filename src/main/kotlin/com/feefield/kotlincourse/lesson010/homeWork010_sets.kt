package com.feefield.kotlincourse.lesson010

fun main() {

//Работа с Множествами Set
//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.

    val set01 = setOf<Int>()
    println(set01)

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    val set02 = setOf(1,2,3)
    println(set02)

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").

    val set03 = mutableSetOf("Kotlin", "Java", "Scala")
    println(set03)

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").

    val set04 = set03
    set04.add("Swift")
    set04.add("Go")
    println(set04)

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).

    val set05 = mutableSetOf(56,34,2, 88)
    set05.remove(2)
    println(set05)

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.

    val set06 = setOf(4,8,2,12)
    for (i in set06) {
        print("$i ~~~")
    }
println()
//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве
//указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.

    val set07 = setOf("phrase01", "phrase02","phrase03","phrase04")
    fun findPhrase(set07: Set<String>, phrase: String ): Boolean {
        for (i in set07) {
            if (phrase in set07) {
                return true
            }
        }
        return false
    }
    println(findPhrase(set07, "phrase0"))
    println(findPhrase(set07, "phrase02"))


//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
// Реши задачу с помощью циклов.

    val set08 = setOf("phrase01","phrase02")
    val set081 = setOf("phrase03","phrase02")
    val set082 = mutableSetOf<String>()

    for (i in set08) {
        set082.add(i)
    }
    for (i in set081) {
        set082.add(i)
    }
    println(set082)

//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы).
// Реши задачу через вложенные циклы.
    val set09 = setOf(1,2,3,7,39)
    val set091 = setOf(2,4,5,39)
    val sharedEl = mutableListOf<Int>()

    for (i in set09) {
        for (i1 in set091) {
            if (i == i1) {
                sharedEl.add(i)
            }
        }
    }
    println(sharedEl)

//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором).
// Реши задачу через вложенные циклы и переменные флаги.

    val set010 = setOf("elem01", "elem02", "elem03")
    val set0101 = setOf("elem02", "elem03", "elem04")
    val difference = mutableSetOf<String>()

    for (i3 in set010) {
        var present = false

        for (i4 in set0101) {
            if (i3 == i4) {
                present = true
            }
        }
        if (!present) {
            difference.add(i3)
        }
    }
println(difference)

//переменные флаги.
//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.

    val set011 = mutableSetOf("phrase01", "phrase02","phrase03","phrase04",)
    val listToSet = mutableListOf<String>()

    for (i in set011) {
        listToSet.add(i)
    }
    println(listToSet)
}