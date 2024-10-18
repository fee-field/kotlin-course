package com.feefield.kotlincourse.lesson013

fun main() {
    val collect01 = listOf(1, 3, 5, 6, 7, 9, 19, 27, 19)

//Проверить, что размер коллекции больше 5 элементов

    if (collect01.size > 5) {
        println("true")
    } else {
        println("false")
    }

//Проверить, что коллекция пустая
    if (collect01.isEmpty()) {
        println("isEmpty")
    } else {
        println("false")
    }

//Проверить, что коллекция не пустая
    if (collect01.isNotEmpty()) {
        println("isNotEmpty")
    } else {
        println("false")
    }

//Взять элемент по индексу или создать значение если индекса не существует
    val index = collect01.getOrElse(30) { "index does not exist" }
    println(index)

//Собрать коллекцию в строку
    val string = collect01.joinToString(" ~|||~ ")
    println(string)
//Посчитать сумму всех значений
    val sum = collect01.sum()
    println(sum)

//Посчитать среднее
    val average: Double = collect01.average()
    println(average)

//Взять максимальное число
    val max = collect01.maxOrNull()
    println(max)

//Взять минимальное число
    val min = collect01.minOrNull()
    println(min)

//Взять первое число или null
    val firstNumb = collect01.getOrNull(3)
    println(firstNumb)
//Проверить что коллекция содержит элемент
    val i = 16
    if (collect01.contains(i)) {
        println("true")
    } else {
        println("does not contain $i")
    }

// Задачи на обработку коллекций

    //Отфильтровать коллекцию по диапазону 18-30
    val range1 = collect01.filter { it in 18..30 }
    println(range1)

    //Выбрать числа, которые не делятся на 2 и 3 одновременно
    val divide1 = collect01.filterNot { it % 2 == 0 || it % 3 == 0 }
    println(divide1)

    //Очистить текстовую коллекцию от null элементов
    val strings = listOf("one", "two", "three", "four", "five", null, "six", null)
    val strings1 = listOf("one", "two", "three", "four", "five")
    val removeNulls = strings.filterNotNull()
    println(removeNulls)

    //Преобразовать текстовую коллекцию в коллекцию длин слов
    val length = strings1.map { it.length }
    println("$length - длины слов")

    //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val maps = strings1.associate { it to it.reversed() }
    println("$maps - перевернутые слова")

    //Отсортировать список в алфавитном порядке

    val sorted = strings1.sorted()
    println(sorted)

    //Отсортировать список по убыванию
    val sortedDesc = collect01.sortedDescending()
    println(sortedDesc)

    //Распечатать квадраты элементов списка
    val double = collect01.forEach({ println(it * it) })

    //Группировать список по первой букве слов
    val group = strings.groupBy { }

    //Очистить список от дублей
    val distinct = collect01.distinct()
    println(distinct)

    //Взять первые 3 элемента списка
    val last = collect01.take(3)
    println(last)

    //Взять последние 3 элемента списка
    val last1 = collect01.takeLast(3)
    println(last1)

    //Задание 2: Характеристика числовой коллекции

    //Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when

    //Если коллекция пустая - “Пусто”
    //Если количество элементов меньше пяти - “Короткая”
    //Если коллекция начинается с 0 - “Стартовая”
    //Если сумма всех чисел больше 10000 - “Массивная”
    //Если среднее значение равно 10 - “Сбалансированная”
    //Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    //Если максимальное число меньше -10 - “Отрицательная”
    //Если минимальное число больше 1000 - “Положительная”
    //Если содержит одновременно числа 3 и 14 - “Пи***тая”
    //Иначе - “Уникальная”
    //
    //Вызвать метод с данными, подходящими под каждую из веток

    val list1: List<Int> = listOf()

    val list3 = listOf(0, 1)
    val list4 = listOf(100000, 1)
    val list5 = listOf(20, 0)
    val list6 = listOf(12, 1123, 254, 321, 45, 7)
    val list7 = listOf(-800, -11)
    val list8 = listOf(1002, 1001)
    val list9 = listOf(3, 14)
    val list10 = listOf(6, 1, 2, 3, 4, 5)
    val list2 = listOf(3, 13, -7, 0)

    println(task02(list1))

    println(task02(list3))
    println(task02(list4))
    println(task02(list5))
    println(task02(list6))
    println(task02(list7))
    println(task02(list8))
    println(task02(list9))
    println(task02(list10))
    println(task02(list2))

//task 03
//Задание 3: Анализ Учебных Оценок
//Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    val filtered = grades.filter{it >= 60 }
    val filtAsc = filtered.sorted()
    println(filtAsc.take(3))


//Задание 4: Создание каталога по первой букве.
//Начальные значения: val list = listOf(
//"Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
//)
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    val lowerCase = list.map{it.lowercase()}
    val groupedFirst = lowerCase.groupBy { it.first() }
    println(groupedFirst)



//Задание 5: Подсчёт средней длины слов в списке.
//Начальные значения из задачи 3.
//Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя знаками после запятой.

    val letters = list.map {it.length}
    val average1 = letters.average()
    println(average1) //// ??????? до двух знаков?


//Задание 6: Категоризация чисел.
//Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    val distinct1 = numbers.distinct()
    val sortedDist = distinct1.sortedDescending()
    val groupedSorted = sortedDist.groupBy { if (it % 2 == 0) "чётные" else "нечётные" }
    println(groupedSorted)

//Задание 7: Поиск первого подходящего элемента
//Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке,
// или вернуть сообщение "Подходящий возраст не найден".

    val ages = listOf(17, 22, 18, 30, 45, 17, null, 60)
    val condition = ages.firstOrNull{(it?:0) > 18}
    val toString = condition.toString()

    fun convert(agesfun: List<Int?>) {
        if (condition != null) {
        println(toString)
        } else {
            println("Подходящий возраст не найден")
        }

    }
    println(convert(ages))


}

// task02

    fun task02(list: List<Int>): String {
        return when {
        list.isEmpty() -> "Пусто"
        list.getOrNull(0) == 0 -> "Стартовая"
        list.sum() > 10000 ->    "Массивная"
        list.average().toInt() == 10 -> "Сбалансированная"
        list.joinToString(separator = "%").length == 20 -> "Клейкая"
        list.max() < -10 ->    "Отрицательная"
        list.min() > 1000 -> "Положительная"
        list.contains(3) && list.contains(14) -> "Пи***тая"
            list.size < 5  -> "Короткая"
         else -> "Уникальная"
        }

    }





