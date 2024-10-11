package com.feefield.kotlincourse.lesson011

fun main() {

//Задание 1: Создание Пустого Словаря
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

    val map01: Map<Int, Int> = mapOf()

//Задание 2: Создание и Инициализация Словаря
//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float,
// а значения - double

    val map02: Map<Float, Double> = mapOf(2.1f to 3.2, 1.2f to 3.7, 3.3f to 51.6)

//Задание 3: Создание Изменяемого Словаря
//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

    val map03: Map<Int, String> = mutableMapOf()

//Задание 4: Добавление Элементов в Словарь
//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

    val map04  = mutableMapOf(1 to "one", 2 to "two")
        map04[3] = "three"
        map04[4] = "four"
        println(map04)

//Задание 5: Получение Значений из Словаря
//Используя словарь из предыдущего задания, извлеките значение, используя ключ.
// Попробуй получить значение с ключом, которого в словаре нет.

    println(map04[3])
    println(map04[6])

//Задание 6: Удаление Элементов из Словаря
//Удалите определенный элемент из изменяемого словаря по его ключу.

    map04.remove(2)
    println(map04)

//Задание 7: Перебор Словаря в Цикле
//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа
// на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

    val map07: Map<Double, Int> = mapOf(1.1 to 0, 2.2 to 1, 3.3 to 2)
    for (i in map07) {
        if (i.value == 0) {
            println("infinity")
        } else {
            val result = i.key / i.value
            println(result)
        }

    }
//Задание 8: Перезапись Элементов Словаря
//Измените значение для существующего ключа в изменяемом словаре.

        val map08 = mutableMapOf("test1" to 1, "test2" to 2)
        map08["test2"] = 3
        println(map08)

//Задание 9: Сложение Двух Словарей
//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

        val map09 = mapOf(1 to "one", 2 to "two", 3 to "three")
        val map091 = mapOf(4 to "four", 5 to "five", 6 to "six")
        val map092 = mutableMapOf<Int, String>()

        for (i1 in map09) {
            map092[i1.key] = i1.value
        }
        for (i2 in map091) {
            map092[i2.key] = i2.value
        }
    println(map092)

//Задание 10: Словарь с Сложными Типами
//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.

    val map010 = mutableMapOf("one" to 1, "two" to 2)
    map010["three"] = 3
    map010["four"] = 4
    println(map010)

//Задание 11: Использование Множества в Качестве Значения
//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
// Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк) и
// добавь в это множество ещё строку. Распечатай полученное множество.

    val map011: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    map011[1] = mutableSetOf("apple", "banana", "pear")
    map011[2] = mutableSetOf("carrot", "potato")
    val key11 = map011[2]
    key11?.add("cucumber")
    println(map011[2])

//Задание 12: Поиск Элемента по Значению
//Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого
// пара будет содержать цифру 5 в качестве первого или второго значения.

    val map012 = mapOf(Pair(1,2) to "the first pair 1",
        Pair(3,4) to "the second pair 2",
        Pair(5,6) to "the third pair 3")
    for ((key, value) in map012) {
        if (key.first == 5 || key.second == 5) {
            println("$value")

        }
    }

//Задание 6: Словарь Библиотека
//Ключи - автор книги, значения - список книг
    val library: MutableMap<String, MutableList<String>> = mutableMapOf()
    library["Лем"] = mutableListOf("Солярис", "Непобедимый", "Сумма технологии")
    library["Кизи"] = mutableListOf("Над кукушкиным гнездом", "Порою блажь великая")
    println(library)

//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

    val plants: MutableMap<String, Set<String>> = mutableMapOf() // лучше immutable
    plants["цветы"] = setOf("ромашки", "лютики", "васильки")
    plants["деревья"] = setOf("дуб", "береза", "ива")
    println(plants)

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды

    val teams: MutableMap<String, MutableList<String>> = mutableMapOf()

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату

    val treatmentPlan: MutableMap<String, MutableList<String>> = mutableMapOf()

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.

    val travellerMap: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf() // омг

}