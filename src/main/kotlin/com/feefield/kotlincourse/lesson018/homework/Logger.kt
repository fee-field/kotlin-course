package com.feefield.kotlincourse.lesson018.homework

class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }

    //Выполнить перегрузку метода log, который:
//Принимает уровень логирования и сообщение. Выводит сообщения типа
// WARNING жёлтым цветом, а ERROR белым цветом на красном фоне.

    fun log(level: String, message: String) {
        val formatted = when (level) {
            "WARNING" -> "\u001B[31m: $message\u001B[0m"
            "ERROR" -> "\u001B[37m\u001B[41mERROR: $message\u001B[0m"
            else -> "INFO: $message"
        }
        println(formatted)
    }

    fun log(messages: List<String>) {
        messages.forEach { message -> println("INFO: $message") }
    }


}