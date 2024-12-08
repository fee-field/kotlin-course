package com.feefield.kotlincourse.classWork

import java.io.File

fun main() {

    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    with(list) {     // существует сама по себе
        println(size)
        add(4)
        println(size)
    }

    list.add(5)
    val result1 = list.sum()

    val result2 = list.run {
        add(5)
        sum()
    }
    val s = File("example.txt").inputStream()
    val content = s.readBytes()
    println(content)
    s.close()

    val list4 = mutableListOf<Int>().apply { //инициализация сложного объекта, возвращаеет то же
        add(1)
        add(2)

    }

    val str: String? = "Hello"
    str?.let {
        println(it.length)  // Выполняется только если str не null

    }

}