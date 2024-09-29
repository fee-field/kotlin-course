package com.feefield.kotlincourse.lesson08

fun main () {


//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
    val originalString = "Это невозможно выполнить за один день"
    val replaceString = originalString.replace("невозможно", "совершенно точно возможно, просто требует времени")
    println(replaceString)
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".

//    val addedString = originalString2.startsWith("Я не уверен")
//    var result = ""


    fun addString(originalString2: String): String {

        val additionalString = ", но моя интуиция говорит об обратном"
        return if (originalString2.startsWith("Я не уверен")) {
            originalString2 + additionalString
        } else {
            originalString2
        }
    }

    val originalString2 = "Я не уверен в успехе этого проекта"
    val result = addString(originalString2)
    println(result)

//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".

    val string3 = "Произошла катастрофа на сервере"
    val result3 = string3.replace("катастрофа", "интересное событие")
    println(result3)

    //Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
    fun replace2(string4: String): String {
        val added4 = "с парой интересных вызовов на пути"
        return if (string4.endsWith("без проблем")) {
            string4.replace("без проблем", added4)
        } else {
            string4
        }
    }

    val string4 = "Этот код работает без проблем"
    val result4 = replace2(string4)
    println(result4)

//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

    fun added5(string5: String): String {
        return if (!string5.contains(" ")) {
            "Иногда, $string5, но не всегда"
        } else {
            string5
        }
    }

    val string5 = "Удача"
    val result5 = added5(string5)
    println(result5)

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

    val string6 = "Пользователь вошел в систему -> 2021-12-01 09:48:23".split("-> ")
    val date = string6[1]
    val date1 = date.split(" ")
    println(date1[0])
    println(date1[1])

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
    val creditCard = "4539 1488 0343 6467"
    val splitCreditCard = creditCard.split(" ")
    println("**** **** **** ${splitCreditCard[3]}")

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".

    val email = "username@example.com"
    val emailAt = email.replace("@", " [at] ")
    println(emailAt.replace(".", " [dot] "))

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
    val path = "C:/Пользователи/Документы/report.txt"
    val pathSplit = (path.split("/"))
    println(pathSplit[3])

//Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
// Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
// Создайте аббревиатуру из начальных букв слов (например, "ООП").
    val phrase = "Объектно-ориентированное программирование"
    val words = phrase.split("-"," ")
    var oop = ""

    for (word in words) {
        oop += word[0].uppercase()
    }
   println(oop)


}










