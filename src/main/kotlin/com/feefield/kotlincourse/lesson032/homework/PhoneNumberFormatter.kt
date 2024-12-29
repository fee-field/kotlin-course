package com.feefield.kotlincourse.lesson032.homework


//Очищаем строку от невалидных символов через замену всех нечисловых знаков на пустую строку. Делается это
// через replace который принимает regex выражение "\\D".toRegex() ( \\D - это выражение, которое находит
// все нечисловые значения)
//Если длина полученной числовой строки не равна 10 или 11 знакам - выкидываем исключение
//Если в строке 10 значений и она не начинается на 7 или 8, добавляем в начало 7 иначе выкидываем исключение
//Если строка начинается на `8` или `7`, символ заменяется на `+7`, иначе выкидываем исключение
//Создаём фрагменты номера с помощью substring и вставляем их в шаблон


class PhoneNumberFormatter {
    fun formatPhoneNumber(input: String): String {
        val number = input.replace("\\D".toRegex(), "")

        if (number.length != 10 && number.length != 11) {
            throw IllegalArgumentException("Not enough digits")
        }
        if (number.length == 10 && (number.startsWith("7") || number.startsWith("8"))) {
            val newNumber = "+7" + number.substring(1)
            return "+7 (${newNumber.substring(2, 5)}) ${newNumber.substring(5, 8)} - ${
                newNumber.substring(
                    8,
                    10
                )
            }-${newNumber.substring(10, 12)}"
        } else if (number.length == 10) {
            return "+7" + number
        } else {
            throw IllegalArgumentException("Wrong number")
        }
    }
}