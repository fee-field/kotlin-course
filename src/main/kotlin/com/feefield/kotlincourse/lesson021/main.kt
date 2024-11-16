package com.feefield.kotlincourse.lesson021

//Создайте функцию toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>, которая будет создавать карту из
// списков ключей и значений. Если ключей или значений больше, то оставшиеся ключи или значения не
// записываем в словарь.
fun main(){

}


fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {
    val map = mutableMapOf<K,V>()
    val size = minOf(keys.size, values.size)
    for (i in 0 .. size) {
        map[keys[i]] = values[i]
    }
    return map
}


//Напишите функцию getMiddleElement<T>(list: List<T>): T?, которая будет возвращать средний элемент списка,
// если он существует.

fun <T> getMiddleElement(list: List<T>): T? {

    return if (list.isNotEmpty())
        list[list.size / 2] else null
}