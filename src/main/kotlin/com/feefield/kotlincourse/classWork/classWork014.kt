package com.feefield.kotlincourse.classWork


fun main() {
    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {  // перебор словаря
        println("Key: ${entry.key}, Value: ${entry.value}")

    }
    for ((fruit, price) in fruitsPrices) {   // деструктуризация
        println("Key: $fruit, Value: $price")

    }

    val entries = fruitsPrices.entries  // получение данных из словаря
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values

//    fruitsPrices["pear"]
//    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { throw IllegalArgumentException() }
    val priceOfApple = fruitsPrices.getValue("apple")
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

    // изменение
    val fruitsWithoutBanana = fruitsPrices - "banana"
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5)
    val mutableFruits = fruitsPrices.toMutableMap()

    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear()

    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()

    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }

}

fun classWork() {
    val map = mapOf<String, Int>()
    for (entry in map.entries) {
        println("${entry.key} = ${entry.value}")
    }
    println(map.values)
    println(map.keys)

    val goods = mapOf<String, Int>()
    println(goods.getOrElse("product01") {throw IllegalArgumentException()})
    println(goods.containsKey("pear"))
    println(goods.containsValue(10))

    val listOfGoods = goods.map {"${it.key} : ${it.value}"}

    val counts = goods.all { it.value > 10 }
    val countsOne = goods.any {it.value > 100}
    goods.filterValues { it > 100 }

    goods.toMutableMap()
    val mutableMap = goods.toMutableMap()
    mutableMap.remove("pineapple")
    mutableMap.putAll(mapOf())
    mutableMap.clear()

}