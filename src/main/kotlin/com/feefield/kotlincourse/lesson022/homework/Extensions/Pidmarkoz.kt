package com.feefield.kotlincourse.lesson022.homework.Extensions

//Напиши метод расширения строки, который будет принимать список имён пользователей и
// выводить в консоли эту строку побуквенно в столбик: имя автора и букву под ним.

fun List<String>.pidmarkoz(listUsers: List<String>) {
    for (i in 0 until this.size) {
        val user = listUsers.getOrNull(i)
        val letter = this.getOrNull(i)
        println("$user, $letter")
    }
}