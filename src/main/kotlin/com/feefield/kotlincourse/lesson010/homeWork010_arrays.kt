package com.feefield.kotlincourse.lesson010

fun  main() {


//Работа с массивами Array
//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.

    val array01 = arrayOf(1, 2, 3, 4, 5)
    println(array01.toList())

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.

    val array02 = Array(10) { "" }
    println(array02.toList())

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями,
// являющимися удвоенным индексом элемента.

    val array03 = DoubleArray(5) { 0.0 }

    for (i in array03.indices) {
        array03[i] = i * 2.0
    }
    println(array03.toList())

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
// равное его индексу, умноженному на 3.

    val array04 = Array(5) { 0 }
    for (i in array04.indices) {
        array04[i] = i * 3
    }
    println(array04.toList())

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.

    val array05 = arrayOfNulls<String>(3)
    array05[1] = "element01"
    array05[2] = "element02"
    println(array05.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val array06 = arrayOf(10, 20, 30, 40, 50)
    val array061 = Array(5) { 0 }

    for (i in array06.indices) {
        array061[i] = array06[i]
    }
    println(array061.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val array07 = arrayOf(1, 2, 3)
    val array071 = arrayOf(25, 101, 87)
    val array072 = Array(3) { 0 }

    for (i in array07.indices) {
        array072[i] = array071[i] - array07[i]

    }
    println(array072.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5.
//Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

    val array08 = arrayOf(15, 7, 5, 11)
    var i = 0

    while (i in array08.indices) {
        val index = array08[i]
        if (index == 5) {
            println(index)
        } else {
            println(-1)
        }
        i++
    }

//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента
//в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.

    val array09 = arrayOf(45, 96, 101, 36, 78)
    for (ii in array09.indices) {
        if (array09[ii] % 2 == 0) {
            println("${array09[ii]} - чётное")
        } else {
            println("${array09[ii]} - не чётное")
        }
    }
//        println(array09.toList())


//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить
// в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
// Верни найденный элемент из функции в виде строки.

    val array010 = arrayOf("line01", "line02", "line03")
    println(findElement(array010, "e02"))
}
    fun findElement(array010: Array<String>, phrase1: String): String {
        for (i2 in array010) {
            if (i2.contains(phrase1)) {
                return i2
            }
        }
        return "none"
    }
