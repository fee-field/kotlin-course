package com.feefield.kotlincourse.lesson015.homeWork015


//Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию.
// У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(), который выводит описание\
// эмоции в зависимости от её типа и интенсивности.


class Emotion (
    val type: String,
    val intensity: Int
) {
    fun express() {
        val emotionDescription = when (intensity) {
            in 1..5 -> "weak"
            in 6..10 -> "strong"
            else -> "Your emotion is not recognized"
            }
        println("Your $type is of $intensity intensity.")
    }
}