package com.feefield.kotlincourse.classWork
/*
fun main() {

    // Обычное объявление функции

    fun increment(a: Int): Int {
        return a + 1
    }

    val increment1 = fun(a: Int): Int {
        return a + 1
    }

    val increment2: (Int) -> Int = { a ->
        a + 1
    }

    val increment3 = { a: Int ->
        a + 1
    }


    fun findIndex(text: String, word: String, ignoreCase: Boolean = false): Int {
        return text.indexOf(word, 0, ignoreCase)
    }

    val findIndex1 = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }

    val findIndex2: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
        text.indexOf(word, 0, ignoreCase)
    }

    val findIndex3 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)

    }


    val calculateDeliveryTime = fun OrderProcessor.(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }

    val calculateDeliveryTime1: OrderProcessor.(Int) -> String = {
        val deliveryTimeDays = when (it) {
            in 1..100 -> 3
            else -> 5
        }
        "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }

    val op = OrderProcessor("my address")
    op.calculateDeliveryTime1(34)
}


fun OrderProcessor.calculateDeliveryTime(productId: Int): String {
    val deliveryTimeDays = when (productId) {
        in 1..100 -> 3
        else -> 5
    }
    return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
}

class OrderProcessor(val deliveryAddress: String) {
    fun calculateDeliveryTime(productId: Int): String {
        val deliveryTimeDays = when (productId) {
            in 1..100 -> 3
            else -> 5
        }
        return "Ожидаемая дата доставки: через $deliveryTimeDays дня(ей) по адресу $deliveryAddress."
    }
}
*/

//fun main() {
//    val function = fun(a: String): Int {
//        return a.length
//    }
//
//    val function1: (String) -> Int = {
//        it.length
//    }
//    val function2 = { a: String ->
//        a.length
//    }
//}
//
//fun function(a: String): Int {
//    return a.length
//}

//fun main() {
//    val string1 = fun String.(a: Int, b: Int): Boolean {
//        println(this)
//        println(a)
//        println(b)
//        return a == b
//    }
//
//    val string2: String.(Int, Int) -> Boolean = { a, b ->
//        println(this)
//        println(a)
//        println(b)
//        a == b
//    }
//   println("hello".string2(3,2))
//}
//
//fun String.string1(a: Int, b: Int): Boolean {
//    println(this)
//    println(a)
//    println(b)
//    return a == b
//}

fun main() {

    val list1 = fun(a: List<Int>): Int {
        return a.filter { it > 0 }.sum()
    }

    val list2: (List<Int>) -> Int = { list ->
        list.filter { it > 0 }.sum()
    }
    val list3 = { list: List<Int> ->
        list.filter { it > 0 }.sum()
    }

    val filter = fun Set<Int>.(): Set<Int> {
        return this.filter { it % 2 == 0 }.toSet()  // filter возвращает list
    }
    val filter1: Set<Int>.() -> Set<Int> = {
        filter { it % 2 == 0 }.toSet()
    }
    val set = setOf(1,2,3,4,5)
    println(set.filter1())
}

fun sum(a: List<Int>): Int {
    return a.filter { it > 0 }.sum()
}

fun Set<Int>.filterEven(): Set<Int> {
    return this.filter { it % 2 == 0 }.toSet()  // filter возвращает list
}
