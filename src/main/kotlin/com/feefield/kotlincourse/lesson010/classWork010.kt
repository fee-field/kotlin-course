package com.feefield.kotlincourse.lesson010

fun main() {
    val num: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val num1 = arrayOf<Int>()
    val num2 = doubleArrayOf(1.1, 1.2, 2.2)

    val num3 = arrayOfNulls<Int>(5)
    val num4 = Array(5) {""}
    val readOnlyList: List<String> = listOf("a", "b", "c")
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)
    val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableList.add("vi")
    println(num[2])
    println(readOnlyList[2])
    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }
    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }
    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }

    val array1: Array<Int> = Array(100) { 0 }
    val array2 = doubleArrayOf(1.0, 2.0, 3.0)
    val array3 = Array(10) { 0 }
    array3[0] = 10
    for (i in array3.indices){
        array3[i] = (i + 1) * 10
    }
    println(array3.toList())

    val array4 = arrayOf("q", "dsfjs", "sdf", "dfg")
    for(i in array4.indices) {
        array4[i] = " "
    }
    println(array4.toList())

    val array5 = arrayOf(1, 3, 5)
    val array6 = arrayOf(2, 4, 6)
    val emptyArray = Array(3) { 0 }
    for (i in emptyArray.indices){
        emptyArray[i] = array6[i] + array5[i]
    }
    println(emptyArray.toList())

    val list1 = listOf<Int>()
    val list2 = listOf("erwe", "rewr", "werewrew")
    val mutableList1 = mutableListOf<Float>()
    mutableList1.add(0,5f)
    mutableList1.add(6f)
    mutableList1.remove(6f)
    mutableList1.removeAt(0)
    println(mutableList1)

    for(i in list2){
        println(i)
    }

    val set1 = setOf<Int>()
    val set2 = setOf(1, 5, 6, 7, 9)
    val set3 = mutableSetOf(1, 3, 4)
    set3.add(5)
    set3.remove(4)
    println(set3)

    for (i in set3) {
        println(i + i)
    }
    val set4 = setOf(1, 2, 3)
    val set5 = setOf(5, 2, 7, 8)
    val emptySet1 = mutableSetOf<Int>()
    for (i in set4){
        emptySet1.add(i)
    }
    for (i in set5){
        emptySet1.add(i)
    }
    println(emptySet1)
}
fun findNumber(set3: Set<Int>, num: Int): Boolean {
    for (i in set3){
        if(num in set3){
            return true
        }
    }
    return false
}