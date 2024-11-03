package com.feefield.kotlincourse.lesson018.homework


//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества.
//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.

class Cart {
    private val items = mutableMapOf<Int, Int>()


//Базовый метод addToCart(itemId) добавляет одну единицу товара к уже существующим в корзине.

    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }


//Выполнить перегрузку addToCart который:
//Принимает два аргумента (itemId и количество amount)
//Принимает словарь из id и количества и добавляет всё в корзину

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

//Принимает список из id (добавляет по одной единице).

    fun addToCart(itemIds: List<Int>) {
        itemIds.forEach { addToCart(it) }
    }

    fun addToCart(itemMap: Map<Int, Int>) {
        for ((itemId, amount) in itemMap) {
            addToCart(itemId, amount)
        }
    }
//Переопредели у корзины метод toString для красивого форматирования содержимого таблицы, включая итоговое
//количество артикулов и общее количество всего товара в корзине.

        override fun toString(): String {
            var cart1 = "This is your shopping cart:"
            var totalUniqueItems = 0
            var total = 0


            for ((itemId, quantity) in items) {
                cart1 += "Items: $itemId | Total: $quantity\n"
                totalUniqueItems++
                total += quantity
            }
            cart1 += "Total unique items in your cart: $totalUniqueItems \n"
            cart1 += "Total of Products: $total"
            return cart1
        }
    }
